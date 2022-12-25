package com.mkprogs.flutterhelper.actions

import com.intellij.lang.java.JavaLanguage
import com.intellij.openapi.actionSystem.*
import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.command.CommandProcessor
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory
import com.intellij.psi.PsiDocumentManager
import com.intellij.psi.PsiFileFactory
import com.mkprogs.flutterhelper.generator.BaseFileGenerator

abstract class BaseGenerateAction<T : BaseFileGenerator> : AnAction() {

    private lateinit var dataContext: DataContext

    override fun update(e: AnActionEvent) {
        e.dataContext.let {
            this.dataContext = it
            val presentation = e.presentation
            presentation.isEnabled = true
        }
    }

    fun generate(mainSourceGenerators: List<T>, name: String, useFolder: Boolean, folderName: String?) {
        val project = CommonDataKeys.PROJECT.getData(dataContext)
        val view = LangDataKeys.IDE_VIEW.getData(dataContext)
        val selectedDirectory = view?.orChooseDirectory

        ApplicationManager.getApplication().runWriteAction {
            val directory: PsiDirectory = if (!useFolder) {
                selectedDirectory!!
            } else {
                selectedDirectory?.findSubdirectory(folderName!!) ?: selectedDirectory?.createSubdirectory(
                    folderName!!
                )!!
            }
            CommandProcessor.getInstance().executeCommand(
                project,
                {
                    mainSourceGenerators.forEach { createSourceFile(project!!, it, directory) }
                },
                "Generate a $name",
                null
            )
        }
    }

    private fun createSourceFile(project: Project, generator: T, directory: PsiDirectory) {
        val fileName = generator.fileName()
        val existingPsiFile = directory.findFile(fileName)
        if (existingPsiFile != null) {
            val document = PsiDocumentManager.getInstance(project).getDocument(existingPsiFile)
            document?.insertString(document.textLength, "\n" + generator.generate())
            return
        }
        val psiFile = PsiFileFactory.getInstance(project)
            .createFileFromText(fileName, JavaLanguage.INSTANCE, generator.generate())
        directory.add(psiFile)
    }


}
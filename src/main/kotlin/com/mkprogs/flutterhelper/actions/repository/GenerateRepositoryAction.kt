package com.mkprogs.flutterhelper.actions.repository

import com.intellij.openapi.actionSystem.AnActionEvent
import com.mkprogs.flutterhelper.actions.BaseGenerateAction
import com.mkprogs.flutterhelper.generator.repository.RepositoryFileGenerator
import com.mkprogs.flutterhelper.generator.repository.RepositoryFileGeneratorFactory
import com.mkprogs.flutterhelper.helpers.toLowerSnakeCase

class GenerateRepositoryAction : BaseGenerateAction<RepositoryFileGenerator>(), GenerateRepositoryListener {
    override fun actionPerformed(e: AnActionEvent) {
        NewRepositoryDialog(this).showAndGet()
    }

    override fun onGenerateRepositoryClicked(name: String?) {
        name?.let {
            val generators = RepositoryFileGeneratorFactory.getRepositoryGenerators(it)
            generate(generators, "Repository", true, "${name.toLowerSnakeCase()}_repository")
        }
    }
}
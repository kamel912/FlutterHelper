package com.mkprogs.flutterhelper.actions.repository

import com.fleshgrinder.extensions.kotlin.toLowerCamelCase
import com.intellij.openapi.actionSystem.AnActionEvent
import com.mkprogs.flutterhelper.actions.BaseGenerateAction
import com.mkprogs.flutterhelper.generator.repository.RepositoryFileGenerator
import com.mkprogs.flutterhelper.generator.repository.RepositoryFileGeneratorFactory

class GenerateRepositoryAction : BaseGenerateAction<RepositoryFileGenerator>(), GenerateRepositoryListener {
    override fun actionPerformed(e: AnActionEvent) {
        NewRepositoryDialog(this).showAndGet()
    }

    override fun onGenerateRepositoryClicked(name: String?) {
        name?.let {
            val generators = RepositoryFileGeneratorFactory.getRepositoryGenerators(it)
            generate(generators, "Repository" , true, "${name.toLowerCamelCase()}_repository")
        }
    }
}
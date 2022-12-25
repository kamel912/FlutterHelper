package com.mkprogs.flutterhelper.actions.bloc

import com.intellij.openapi.actionSystem.AnActionEvent
import com.mkprogs.flutterhelper.actions.BaseGenerateAction
import com.mkprogs.flutterhelper.generator.bloc.BlocFileGenerator
import com.mkprogs.flutterhelper.generator.bloc.BlocFileGeneratorFactory

class GenerateBlocAction : BaseGenerateAction<BlocFileGenerator>(),
    GenerateBlocListener {
    override fun actionPerformed(e: AnActionEvent) {
        NewBlocDialog(this, "Bloc", "Bloc name goes here (e.g. Login)").showAndGet()
    }

    override fun onGenerateBlocClicked(name: String?, useEquatable: Boolean, useFreezed: Boolean, useFolder: Boolean) {
        name?.let {
            val generators = BlocFileGeneratorFactory.getBlocGenerators(it, useEquatable, useFreezed)
            generate(generators, "Bloc", useFolder, "bloc")
        }
    }
}
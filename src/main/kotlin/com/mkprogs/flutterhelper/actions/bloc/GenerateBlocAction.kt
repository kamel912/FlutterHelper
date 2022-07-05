package com.mkprogs.flutterhelper.actions.bloc

import com.intellij.openapi.actionSystem.AnActionEvent
import com.mkprogs.flutterhelper.actions.BaseGenerateAction
import com.mkprogs.flutterhelper.generator.bloc.BlocGenerator
import com.mkprogs.flutterhelper.generator.bloc.BlocGeneratorFactory

class GenerateBlocAction : BaseGenerateAction<BlocGenerator>(),
    GenerateBlocListener {
    override fun actionPerformed(e: AnActionEvent) {
        NewBlocDialog(this, "Bloc", "Bloc name goes here (e.g. Login)").showAndGet()
    }

    override fun onGenerateBlocClicked(name: String?, useEquatable: Boolean, useFreezed: Boolean, useFolder: Boolean) {
        name?.let {
            val generators = BlocGeneratorFactory.getBlocGenerators(it, useEquatable, useFreezed)
            generate(generators, "Bloc", useFolder, "bloc")
        }
    }
}
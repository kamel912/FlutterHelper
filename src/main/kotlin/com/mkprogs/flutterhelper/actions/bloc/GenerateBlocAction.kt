package com.mkprogs.flutterhelper.actions.bloc

import com.intellij.openapi.actionSystem.AnActionEvent
import com.mkprogs.flutterhelper.actions.BaseGenerateAction
import com.mkprogs.flutterhelper.generator.bloc.BlocFileGenerator
import com.mkprogs.flutterhelper.generator.bloc.BlocFileGeneratorFactory

class GenerateBlocAction : BaseGenerateAction<BlocFileGenerator>(),
    GenerateBlocListener {
    override fun actionPerformed(e: AnActionEvent) {
        NewBlocDialog(this, "Bloc").showAndGet()
    }

    override fun onGenerateBlocClicked(name: String?, equalityType: EqualityType, useFolder: Boolean) {
        name?.let {
            val generators = BlocFileGeneratorFactory.getBlocGenerators(it, equalityType)
            generate(generators, "Bloc", useFolder, "bloc")
        }
    }
}
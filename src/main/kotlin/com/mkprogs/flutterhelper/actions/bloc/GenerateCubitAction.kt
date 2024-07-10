package com.mkprogs.flutterhelper.actions.bloc

import com.intellij.openapi.actionSystem.AnActionEvent
import com.mkprogs.flutterhelper.actions.BaseGenerateAction
import com.mkprogs.flutterhelper.generator.bloc.CubitFileGenerator
import com.mkprogs.flutterhelper.generator.bloc.CubitFileGeneratorFactory

class GenerateCubitAction : BaseGenerateAction<CubitFileGenerator>(), GenerateBlocListener {

    override fun actionPerformed(e: AnActionEvent) {
        val dialog = NewBlocDialog(this, "Cubit", "Cubit name goes here (e.g. Login)")
        dialog.showAndGet()
    }

    override fun onGenerateBlocClicked(name: String?, equalityType: EqualityType, useFolder: Boolean) {
        name?.let {
            val generators = CubitFileGeneratorFactory.getCubitGenerators(it, equalityType)
            generate(generators, "Cubit", useFolder, "cubit")
        }
    }
}
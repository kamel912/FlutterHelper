package com.mkprogs.flutterhelper.actions.bloc

import com.intellij.openapi.actionSystem.AnActionEvent
import com.mkprogs.flutterhelper.actions.BaseGenerateAction
import com.mkprogs.flutterhelper.generator.bloc.CubitGenerator
import com.mkprogs.flutterhelper.generator.bloc.CubitGeneratorFactory

class GenerateCubitAction : BaseGenerateAction<CubitGenerator>(), GenerateBlocListener {

    override fun actionPerformed(e: AnActionEvent) {
        val dialog = NewBlocDialog(this, "Cubit", "Cubit name goes here (e.g. Login)")
        dialog.showAndGet()
    }

    override fun onGenerateBlocClicked(name: String?, useEquatable: Boolean, useFreezed: Boolean, useFolder: Boolean) {
        name?.let {
            val generators = CubitGeneratorFactory.getCubitGenerators(it, useEquatable, useFreezed)
            generate(generators,"Cubit", useFolder, "cubit")
        }
    }
}
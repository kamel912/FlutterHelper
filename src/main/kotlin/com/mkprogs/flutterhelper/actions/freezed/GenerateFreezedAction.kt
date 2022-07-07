package com.mkprogs.flutterhelper.actions.freezed

import com.fleshgrinder.extensions.kotlin.toLowerCamelCase
import com.intellij.openapi.actionSystem.AnActionEvent
import com.mkprogs.flutterhelper.actions.BaseGenerateAction
import com.mkprogs.flutterhelper.generator.freezed.FreezedGenerator
import com.mkprogs.flutterhelper.generator.freezed.FreezedGeneratorFactory

class GenerateFreezedAction: BaseGenerateAction<FreezedGenerator>(), GenerateFreezedListener {
    override fun actionPerformed(e: AnActionEvent) {
        NewFreezedDialog(this).showAndGet()
    }

    override fun onGenerateFreezedClicked(name: String?, useJson: Boolean, useFolder: Boolean) {
        name?.let{
            val generators = FreezedGeneratorFactory.getFreezedGenerators(it, useJson)
            generate(generators, "Freezed Class", useFolder, folderName = it.toLowerCamelCase())
        }
    }
}
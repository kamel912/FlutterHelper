package com.mkprogs.flutterhelper.actions.freezed

import com.fleshgrinder.extensions.kotlin.toLowerSnakeCase
import com.intellij.openapi.actionSystem.AnActionEvent
import com.mkprogs.flutterhelper.actions.BaseGenerateAction
import com.mkprogs.flutterhelper.generator.freezed.FreezedFileGenerator
import com.mkprogs.flutterhelper.generator.freezed.FreezedFileGeneratorFactory

class GenerateFreezedAction: BaseGenerateAction<FreezedFileGenerator>(), GenerateFreezedListener {
    override fun actionPerformed(e: AnActionEvent) {
        NewFreezedDialog(this).showAndGet()
    }

    override fun onGenerateFreezedClicked(name: String?, useJson: Boolean, useFolder: Boolean) {
        name?.let{
            val generators = FreezedFileGeneratorFactory.getFreezedGenerators(it, useJson)
            generate(generators, "Freezed Class", useFolder, folderName = it.toLowerSnakeCase())
        }
    }
}
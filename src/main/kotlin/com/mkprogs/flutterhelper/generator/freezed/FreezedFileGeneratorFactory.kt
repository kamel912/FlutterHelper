package com.mkprogs.flutterhelper.generator.freezed

import com.mkprogs.flutterhelper.generator.freezed.components.FreezedGenerator

object FreezedFileGeneratorFactory {
    fun getFreezedGenerators(name: String, useJson: Boolean): List<FreezedFileGenerator> {
        val contract = FreezedGenerator(name, useJson)
        return listOf(contract)
    }
}
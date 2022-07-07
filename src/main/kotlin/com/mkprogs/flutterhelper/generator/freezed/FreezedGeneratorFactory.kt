package com.mkprogs.flutterhelper.generator.freezed

import com.mkprogs.flutterhelper.generator.freezed.components.FreezedGenerator

object FreezedGeneratorFactory {
    fun getFreezedGenerators(name: String, useJson:Boolean): List<com.mkprogs.flutterhelper.generator.freezed.FreezedGenerator> {
        val contract = FreezedGenerator(name, useJson)
        return listOf(contract)
    }
}
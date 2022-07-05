package com.mkprogs.flutterhelper.generator.bloc

import com.mkprogs.flutterhelper.generator.bloc.components.CubitGenerator
import com.mkprogs.flutterhelper.generator.bloc.components.CubitStateGenerator

object CubitGeneratorFactory {
    fun getCubitGenerators(name: String, useEquatable: Boolean, useFreezed: Boolean): List<com.mkprogs.flutterhelper.generator.bloc.CubitGenerator> {
        val cubit = CubitGenerator(name, useEquatable, useFreezed)
        val state = CubitStateGenerator(name, useEquatable, useFreezed)
        return listOf(cubit, state)
    }
}
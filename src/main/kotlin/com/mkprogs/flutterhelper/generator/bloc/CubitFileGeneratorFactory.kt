package com.mkprogs.flutterhelper.generator.bloc

import com.mkprogs.flutterhelper.generator.bloc.components.CubitGenerator
import com.mkprogs.flutterhelper.generator.bloc.components.CubitStateGenerator

object CubitFileGeneratorFactory {
    fun getCubitGenerators(
        name: String, useEquatable: Boolean, useFreezed: Boolean
    ): List<CubitFileGenerator> {
        val cubit = CubitGenerator(name, useEquatable, useFreezed)
        val state = CubitStateGenerator(name, useEquatable, useFreezed)
        return listOf(cubit, state)
    }
}
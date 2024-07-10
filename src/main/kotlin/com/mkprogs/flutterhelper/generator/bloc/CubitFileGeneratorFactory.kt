package com.mkprogs.flutterhelper.generator.bloc

import com.mkprogs.flutterhelper.actions.bloc.EqualityType
import com.mkprogs.flutterhelper.generator.bloc.components.CubitGenerator
import com.mkprogs.flutterhelper.generator.bloc.components.CubitStateGenerator

object CubitFileGeneratorFactory {
    fun getCubitGenerators(
        name: String, equalityType: EqualityType,
    ): List<CubitFileGenerator> {
        val cubit = CubitGenerator(name, equalityType)
        val state = CubitStateGenerator(name, equalityType)
        return listOf(cubit, state)
    }
}
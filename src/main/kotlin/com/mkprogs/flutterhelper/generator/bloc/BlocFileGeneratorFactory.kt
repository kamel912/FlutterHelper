package com.mkprogs.flutterhelper.generator.bloc

import com.mkprogs.flutterhelper.actions.bloc.EqualityType
import com.mkprogs.flutterhelper.generator.bloc.components.BlocEventGenerator
import com.mkprogs.flutterhelper.generator.bloc.components.BlocGenerator
import com.mkprogs.flutterhelper.generator.bloc.components.BlocStateGenerator

object BlocFileGeneratorFactory {
    fun getBlocGenerators(name: String, equalityType: EqualityType): List<BlocFileGenerator> {
        val bloc = BlocGenerator(name, equalityType)
        val event = BlocEventGenerator(name, equalityType)
        val state = BlocStateGenerator(name, equalityType)
        return listOf(bloc, event, state)
    }
}
package com.mkprogs.flutterhelper.generator.bloc

import com.mkprogs.flutterhelper.generator.bloc.components.BlocEventGenerator
import com.mkprogs.flutterhelper.generator.bloc.components.BlocGenerator
import com.mkprogs.flutterhelper.generator.bloc.components.BlocStateGenerator

object BlocFileGeneratorFactory {
    fun getBlocGenerators(name: String, useEquatable: Boolean, useFreezed: Boolean): List<BlocFileGenerator> {
        val bloc = BlocGenerator(name, useEquatable, useFreezed)
        val event = BlocEventGenerator(name, useEquatable, useFreezed)
        val state = BlocStateGenerator(name, useEquatable, useFreezed)
        return listOf(bloc, event, state)
    }
}
package com.mkprogs.flutterhelper.generator.bloc.components

import com.mkprogs.flutterhelper.actions.bloc.EqualityType
import com.mkprogs.flutterhelper.generator.bloc.BlocFileGenerator

class BlocStateGenerator(
    name: String,
    equalityType: EqualityType,
) : BlocFileGenerator(name, equalityType, "bloc_state") {
    override fun fileName() = "${snakeCase()}_state.${fileExtension()}"
}
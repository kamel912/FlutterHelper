package com.mkprogs.flutterhelper.generator.bloc.components

import com.mkprogs.flutterhelper.actions.bloc.EqualityType
import com.mkprogs.flutterhelper.generator.bloc.CubitFileGenerator

class CubitStateGenerator(
    name: String,
    equalityType: EqualityType
) : CubitFileGenerator(name, equalityType, templateName = "cubit_state") {
    override fun fileName() = "${snakeCase()}_state.${fileExtension()}"
}
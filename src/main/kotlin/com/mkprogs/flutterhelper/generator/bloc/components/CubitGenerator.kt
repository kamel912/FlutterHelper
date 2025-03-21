package com.mkprogs.flutterhelper.generator.bloc.components

import com.mkprogs.flutterhelper.actions.bloc.EqualityType
import com.mkprogs.flutterhelper.generator.bloc.CubitFileGenerator

class CubitGenerator(
    name: String,
    equalityType: EqualityType,
) : CubitFileGenerator(name, equalityType, "cubit") {
    override fun fileName() = "${snakeCase()}_cubit.${fileExtension()}"
}
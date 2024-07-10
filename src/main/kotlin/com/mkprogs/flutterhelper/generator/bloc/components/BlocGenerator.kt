package com.mkprogs.flutterhelper.generator.bloc.components

import com.mkprogs.flutterhelper.actions.bloc.EqualityType
import com.mkprogs.flutterhelper.generator.bloc.BlocFileGenerator

class BlocGenerator(
    name: String,
    equalityType: EqualityType
) : BlocFileGenerator(name, equalityType, templateName = "bloc") {
    override fun fileName() = "${snakeCase()}_bloc.${fileExtension()}"
}
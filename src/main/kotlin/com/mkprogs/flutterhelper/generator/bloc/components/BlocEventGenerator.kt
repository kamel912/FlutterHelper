package com.mkprogs.flutterhelper.generator.bloc.components

import com.mkprogs.flutterhelper.actions.bloc.EqualityType
import com.mkprogs.flutterhelper.generator.bloc.BlocFileGenerator

class BlocEventGenerator(
    blocName: String,
    equalityType: EqualityType,
) : BlocFileGenerator(blocName, equalityType, "bloc_event") {

    override fun fileName() = "${snakeCase()}_event.${fileExtension()}"
}
package com.mkprogs.flutterhelper.generator.bloc.components

import com.mkprogs.flutterhelper.generator.bloc.BlocFileGenerator

class BlocEventGenerator(
        blocName: String,
        blocShouldUseEquatable: Boolean,
        blocShouldUseFreezed: Boolean
) : BlocFileGenerator(blocName, blocShouldUseEquatable, blocShouldUseFreezed, templateName = "bloc_event") {

    override fun fileName() = "${snakeCase()}_event.${fileExtension()}"
}
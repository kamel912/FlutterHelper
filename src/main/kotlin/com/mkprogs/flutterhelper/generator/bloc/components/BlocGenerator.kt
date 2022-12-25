package com.mkprogs.flutterhelper.generator.bloc.components

import com.mkprogs.flutterhelper.generator.bloc.BlocFileGenerator

class  BlocGenerator(
        name: String,
        useEquatable: Boolean,
        useFreezed: Boolean
) : BlocFileGenerator(name, useEquatable, useFreezed, templateName = "bloc") {
    override fun fileName() = "${snakeCase()}_bloc.${fileExtension()}"
}
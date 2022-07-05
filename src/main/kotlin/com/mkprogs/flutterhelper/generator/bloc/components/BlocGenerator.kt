package com.mkprogs.flutterhelper.generator.bloc.components

import com.mkprogs.flutterhelper.generator.bloc.BlocGenerator

class  BlocGenerator(
        name: String,
        useEquatable: Boolean,
        useFreezed: Boolean
) : BlocGenerator(name, useEquatable, useFreezed, templateName = "bloc") {
    override fun fileName() = "${snakeCase()}_bloc.${fileExtension()}"
}
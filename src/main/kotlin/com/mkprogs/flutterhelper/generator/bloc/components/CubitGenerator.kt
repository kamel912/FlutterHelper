package com.mkprogs.flutterhelper.generator.bloc.components

import com.mkprogs.flutterhelper.generator.bloc.CubitGenerator

class CubitGenerator(
        name: String,
        useEquatable: Boolean,
        useFreezed: Boolean
) : CubitGenerator(name, useEquatable, useFreezed, templateName = "cubit") {
    override fun fileName() = "${snakeCase()}_cubit.${fileExtension()}"
}
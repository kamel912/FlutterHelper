package com.mkprogs.flutterhelper.generator.bloc.components

import com.mkprogs.flutterhelper.generator.bloc.CubitFileGenerator

class CubitGenerator(
        name: String,
        useEquatable: Boolean,
        useFreezed: Boolean
) : CubitFileGenerator(name, useEquatable, useFreezed, templateName = "cubit") {
    override fun fileName() = "${snakeCase()}_cubit.${fileExtension()}"
}
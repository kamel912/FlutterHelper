package com.mkprogs.flutterhelper.generator.bloc.components

import com.mkprogs.flutterhelper.generator.bloc.CubitFileGenerator

class CubitStateGenerator(
        name: String,
        useEquatable: Boolean,
        useFreezed: Boolean
) : CubitFileGenerator(name, useEquatable, useFreezed, templateName = "cubit_state") {
    override fun fileName() = "${snakeCase()}_state.${fileExtension()}"
}
package com.mkprogs.flutterhelper.generator.bloc.components

import com.mkprogs.flutterhelper.generator.bloc.CubitGenerator

class CubitStateGenerator(
        name: String,
        useEquatable: Boolean,
        useFreezed: Boolean
) : CubitGenerator(name, useEquatable, useFreezed, templateName = "cubit_state") {
    override fun fileName() = "${snakeCase()}_state.${fileExtension()}"
}
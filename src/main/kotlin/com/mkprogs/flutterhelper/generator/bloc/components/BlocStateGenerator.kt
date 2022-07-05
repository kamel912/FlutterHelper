package com.mkprogs.flutterhelper.generator.bloc.components

import com.mkprogs.flutterhelper.generator.bloc.BlocGenerator

class BlocStateGenerator(
        name: String,
        useEquatable: Boolean,
        useFreezed: Boolean
) : BlocGenerator(name, useEquatable, useFreezed, templateName = "bloc_state") {
    override fun fileName() = "${snakeCase()}_state.${fileExtension()}"
}
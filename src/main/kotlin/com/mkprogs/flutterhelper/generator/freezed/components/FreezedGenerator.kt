package com.mkprogs.flutterhelper.generator.freezed.components

import com.mkprogs.flutterhelper.generator.freezed.FreezedGenerator

class FreezedGenerator(
    name: String,
    useJson: Boolean
) : FreezedGenerator(name, templateName = if (useJson) "freezed_with_json" else "freezed") {

    override fun fileName() = "${snakeCase()}_freezed.${fileExtension()}"

}


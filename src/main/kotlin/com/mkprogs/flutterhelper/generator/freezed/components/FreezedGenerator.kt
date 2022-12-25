package com.mkprogs.flutterhelper.generator.freezed.components

import com.mkprogs.flutterhelper.generator.freezed.FreezedFileGenerator

class FreezedGenerator(
    name: String,
    useJson: Boolean
) : FreezedFileGenerator(name, templateName = if (useJson) "freezed_with_json" else "freezed") {

    override fun fileName() = "${snakeCase()}.${fileExtension()}"

}


package com.mkprogs.flutterhelper.generator.service.components

import com.mkprogs.flutterhelper.generator.service.ServiceGenerator

class ServiceGenerator(
    name: String,
) : ServiceGenerator(name, templateName = "service") {

    override fun fileName() = "${snakeCase()}_service.${fileExtension()}"

}


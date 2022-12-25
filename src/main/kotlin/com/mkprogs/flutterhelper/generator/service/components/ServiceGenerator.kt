package com.mkprogs.flutterhelper.generator.service.components

import com.mkprogs.flutterhelper.generator.service.ServiceFileGenerator

class ServiceGenerator(
    name: String,
) : ServiceFileGenerator(name, templateName = "service") {

    override fun fileName() = "${snakeCase()}_service.${fileExtension()}"

}


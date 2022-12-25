package com.mkprogs.flutterhelper.generator.service.components

import com.mkprogs.flutterhelper.generator.service.ServiceFileGenerator

class ServiceImplGenerator(
    name: String,
) : ServiceFileGenerator(name, templateName = "service_impl") {

    override fun fileName() = "${snakeCase()}_service_impl.${fileExtension()}"

}


package com.mkprogs.flutterhelper.generator.service.components

import com.mkprogs.flutterhelper.generator.service.ServiceGenerator

class ServiceImplGenerator(
    name: String,
) : ServiceGenerator(name, templateName = "service_impl") {

    override fun fileName() = "${snakeCase()}_service_impl.${fileExtension()}"

}


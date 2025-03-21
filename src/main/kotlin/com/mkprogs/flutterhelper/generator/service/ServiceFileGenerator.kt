package com.mkprogs.flutterhelper.generator.service

import com.mkprogs.flutterhelper.generator.BaseFileGenerator

abstract class ServiceFileGenerator(
    private val fileName: String,
    templateName: String,
) : BaseFileGenerator(
    templateName,
    "service",
    "Service",
    fileName,
) {

    private val templateServicePascalCase = "service_pascal_case"
    private val templateServiceSnakeCase = "service_snake_case"
    private val templateServiceDollarSignCase = "service_dollar_sign_case"


    init {
        templateValues = mutableMapOf(
            templateServicePascalCase to pascalCase(),
            templateServiceSnakeCase to snakeCase(),
            templateServiceDollarSignCase to dollarSignCase()
        )
    }


}



package com.mkprogs.flutterhelper.generator.service

import com.fleshgrinder.extensions.kotlin.toLowerSnakeCase
import com.fleshgrinder.extensions.kotlin.toUpperCamelCase
import com.mkprogs.flutterhelper.generator.BaseGenerator

abstract class ServiceGenerator(
    private val name: String,
    templateName: String
) : BaseGenerator(
    templateName,
   "service"
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


    final override fun pascalCase(): String = name.toUpperCamelCase().replace("Service", "")

    final override fun snakeCase() = name.toLowerSnakeCase().replace("_service", "")


}



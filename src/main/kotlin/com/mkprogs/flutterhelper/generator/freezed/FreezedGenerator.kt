package com.mkprogs.flutterhelper.generator.freezed

import com.fleshgrinder.extensions.kotlin.toLowerSnakeCase
import com.fleshgrinder.extensions.kotlin.toUpperCamelCase
import com.mkprogs.flutterhelper.generator.BaseGenerator

abstract class FreezedGenerator(
    private val name: String,
    templateName: String
) : BaseGenerator(
    templateName,
   "freezed"
) {

    private val templateFreezedPascalCase = "freezed_pascal_case"
    private val templateFreezedSnakeCase = "freezed_snake_case"
    private val templateFreezedDollarSignCase = "freezed_dollar_sign_case"


    init {
        templateValues = mutableMapOf(
            templateFreezedPascalCase to pascalCase(),
            templateFreezedSnakeCase to snakeCase(),
            templateFreezedDollarSignCase to dollarSignCase()
        )
    }


    final override fun pascalCase(): String = name.toUpperCamelCase().replace("Freezed", "")

    final override fun snakeCase() = name.toLowerSnakeCase().replace("_freezed", "")


}



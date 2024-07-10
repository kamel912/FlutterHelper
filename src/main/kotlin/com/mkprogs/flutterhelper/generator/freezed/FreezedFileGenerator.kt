package com.mkprogs.flutterhelper.generator.freezed

import com.mkprogs.flutterhelper.generator.BaseFileGenerator
import com.mkprogs.flutterhelper.helpers.toLowerSnakeCase
import com.mkprogs.flutterhelper.helpers.toUpperCamelCase

abstract class FreezedFileGenerator(
    private val name: String,
    templateName: String
) : BaseFileGenerator(
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



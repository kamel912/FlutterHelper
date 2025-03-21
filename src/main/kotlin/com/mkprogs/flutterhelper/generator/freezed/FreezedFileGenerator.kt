package com.mkprogs.flutterhelper.generator.freezed

import com.mkprogs.flutterhelper.generator.BaseFileGenerator

abstract class FreezedFileGenerator(
    val fileName: String,
    templateName: String,
) : BaseFileGenerator(
    templateName,
    "freezed",
    "Freezed",
    fileName,
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
}



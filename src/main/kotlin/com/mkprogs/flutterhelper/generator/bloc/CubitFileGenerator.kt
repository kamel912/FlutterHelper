package com.mkprogs.flutterhelper.generator.bloc

import com.fleshgrinder.extensions.kotlin.toLowerSnakeCase
import com.fleshgrinder.extensions.kotlin.toUpperCamelCase
import com.mkprogs.flutterhelper.generator.BaseFileGenerator

abstract class CubitFileGenerator(
    private val name: String,
    useEquatable: Boolean,
    useFreezed: Boolean,
    templateName: String
) : BaseFileGenerator(
    templateName,
    if (useFreezed) "cubit_with_freezed" else if (useEquatable) "cubit_with_equatable" else "cubit"
) {

    private val templateCubitPascalCase = "cubit_pascal_case"
    private val templateCubitSnakeCase = "cubit_snake_case"
    private val templateDollarSignCase = "cubit_dollar_sign_case"


    init {
        templateValues = mutableMapOf(
            templateCubitPascalCase to pascalCase(),
            templateCubitSnakeCase to snakeCase(),
            templateDollarSignCase to dollarSignCase()

        )

    }


    final override fun pascalCase(): String = name.toUpperCamelCase().replace("Cubit", "")

    final override fun snakeCase() = name.toLowerSnakeCase().replace("_cubit", "")

}
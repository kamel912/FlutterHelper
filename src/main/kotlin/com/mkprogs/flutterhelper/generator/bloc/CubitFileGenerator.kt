package com.mkprogs.flutterhelper.generator.bloc

import com.mkprogs.flutterhelper.actions.bloc.EqualityType
import com.mkprogs.flutterhelper.generator.BaseFileGenerator
import com.mkprogs.flutterhelper.helpers.toLowerSnakeCase
import com.mkprogs.flutterhelper.helpers.toUpperCamelCase

abstract class CubitFileGenerator(
    private val name: String,
    equalityType: EqualityType,
    templateName: String
) : BaseFileGenerator(
    templateName,
    if (equalityType == EqualityType.FREEZED) "cubit_with_freezed" else if (equalityType == EqualityType.EQUITABLE) "cubit_with_equatable" else "cubit"
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
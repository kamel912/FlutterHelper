package com.mkprogs.flutterhelper.generator.bloc

import com.mkprogs.flutterhelper.actions.bloc.EqualityType
import com.mkprogs.flutterhelper.generator.BaseFileGenerator
import com.mkprogs.flutterhelper.helpers.toLowerSnakeCase
import com.mkprogs.flutterhelper.helpers.toUpperCamelCase

abstract class BlocFileGenerator(
    private val name: String,
    equalityType: EqualityType,
    templateName: String
) : BaseFileGenerator(
    templateName,
    if (equalityType == EqualityType.FREEZED) "bloc_with_freezed" else if (equalityType == EqualityType.EQUITABLE) "bloc_with_equatable" else "bloc"
) {

    private val templateBlocPascalCase = "bloc_pascal_case"
    private val templateBlocSnakeCase = "bloc_snake_case"
    private val templateBlocDollarSignCase = "bloc_dollar_sign_case"


    init {
        templateValues = mutableMapOf(
            templateBlocPascalCase to pascalCase(),
            templateBlocSnakeCase to snakeCase(),
            templateBlocDollarSignCase to dollarSignCase()
        )
    }


    final override fun pascalCase(): String = name.toUpperCamelCase().replace("Bloc", "")

    final override fun snakeCase() = name.toLowerSnakeCase().replace("_bloc", "")


}



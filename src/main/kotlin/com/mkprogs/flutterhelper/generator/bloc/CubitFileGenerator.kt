package com.mkprogs.flutterhelper.generator.bloc

import com.mkprogs.flutterhelper.actions.bloc.EqualityType
import com.mkprogs.flutterhelper.generator.BaseFileGenerator

abstract class CubitFileGenerator(
    fileName: String,
    equalityType: EqualityType,
    templateName: String,
) : BaseFileGenerator(
    templateName,
    when (equalityType) {
        EqualityType.Freezed -> "cubit_with_freezed"
        EqualityType.Equitable -> "cubit_with_equatable"
        EqualityType.None -> "cubit"
    },
    "Cubit",
    fileName,
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


}
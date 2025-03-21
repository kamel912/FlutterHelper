package com.mkprogs.flutterhelper.generator.bloc

import com.mkprogs.flutterhelper.actions.bloc.EqualityType
import com.mkprogs.flutterhelper.generator.BaseFileGenerator

abstract class BlocFileGenerator(
    fileName: String,
    equalityType: EqualityType,
    templateName: String,
) : BaseFileGenerator(
    templateName,
    when (equalityType) {
        EqualityType.Freezed -> "bloc_with_freezed"
        EqualityType.Equitable -> "bloc_with_equatable"
        EqualityType.None -> "bloc"
    },
    "Bloc",
    fileName,
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

}



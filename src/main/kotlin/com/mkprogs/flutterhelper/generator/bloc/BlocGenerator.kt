package com.mkprogs.flutterhelper.generator.bloc

import com.fleshgrinder.extensions.kotlin.toLowerSnakeCase
import com.fleshgrinder.extensions.kotlin.toUpperCamelCase
import com.mkprogs.flutterhelper.generator.BaseGenerator

abstract class BlocGenerator(
    private val name: String,
    useEquatable: Boolean,
    useFreezed: Boolean,
    templateName: String
) : BaseGenerator(
    templateName,
    if (useFreezed) "bloc_with_freezed" else if (useEquatable) "bloc_with_equatable" else "bloc"
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



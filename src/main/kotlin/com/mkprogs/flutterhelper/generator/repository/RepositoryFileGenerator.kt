package com.mkprogs.flutterhelper.generator.repository

import com.mkprogs.flutterhelper.helpers.toLowerSnakeCase
import com.mkprogs.flutterhelper.helpers.toUpperCamelCase
import com.mkprogs.flutterhelper.generator.BaseFileGenerator

abstract class RepositoryFileGenerator(
    private val name: String,
    templateName: String
) : BaseFileGenerator(
    templateName,
   "repository"
) {

    private val templateRepositoryPascalCase = "repository_pascal_case"
    private val templateRepositorySnakeCase = "repository_snake_case"
    private val templateRepositoryDollarSignCase = "repository_dollar_sign_case"


    init {
        templateValues = mutableMapOf(
            templateRepositoryPascalCase to pascalCase(),
            templateRepositorySnakeCase to snakeCase(),
            templateRepositoryDollarSignCase to dollarSignCase()
        )
    }


    final override fun pascalCase(): String = name.toUpperCamelCase().replace("Repository", "")

    final override fun snakeCase() = name.toLowerSnakeCase().replace("_repository", "")


}



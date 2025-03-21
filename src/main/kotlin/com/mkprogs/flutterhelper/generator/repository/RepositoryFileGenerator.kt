package com.mkprogs.flutterhelper.generator.repository

import com.mkprogs.flutterhelper.generator.BaseFileGenerator

abstract class RepositoryFileGenerator(
    fileName: String,
    templateName: String,
) : BaseFileGenerator(
    templateName,
    "repository",
    "Repository",
    fileName,
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


}



package com.mkprogs.flutterhelper.generator.repository.components

import com.mkprogs.flutterhelper.generator.repository.RepositoryFileGenerator

class RepositoryGenerator(
    name: String,
) : RepositoryFileGenerator(name, templateName = "repository") {

    override fun fileName() = "${snakeCase()}_repository.${fileExtension()}"

}


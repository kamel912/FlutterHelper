package com.mkprogs.flutterhelper.generator.repository.components

import com.mkprogs.flutterhelper.generator.repository.RepositoryGenerator

class RepositoryGenerator(
    name: String,
) : RepositoryGenerator(name, templateName = "repository") {

    override fun fileName() = "${snakeCase()}_repository.${fileExtension()}"

}


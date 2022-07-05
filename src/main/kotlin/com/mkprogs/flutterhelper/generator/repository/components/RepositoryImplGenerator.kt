package com.mkprogs.flutterhelper.generator.repository.components

import com.mkprogs.flutterhelper.generator.repository.RepositoryGenerator

class RepositoryImplGenerator(
    name: String,
) : RepositoryGenerator(name, templateName = "repository_impl") {

    override fun fileName() = "${snakeCase()}_repository_impl.${fileExtension()}"

}


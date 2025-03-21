package com.mkprogs.flutterhelper.generator.repository.components

import com.mkprogs.flutterhelper.generator.repository.RepositoryFileGenerator

class RepositoryImplGenerator(
    name: String,
) : RepositoryFileGenerator(name, "repository_impl") {

    override fun fileName() = "${snakeCase()}_repository_impl.${fileExtension()}"

}


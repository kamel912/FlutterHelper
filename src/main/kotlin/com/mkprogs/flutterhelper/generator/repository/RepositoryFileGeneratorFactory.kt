package com.mkprogs.flutterhelper.generator.repository

import com.mkprogs.flutterhelper.generator.repository.components.RepositoryImplGenerator
import com.mkprogs.flutterhelper.generator.repository.components.RepositoryGenerator

object RepositoryFileGeneratorFactory {
    fun getRepositoryGenerators(name: String): List<RepositoryFileGenerator> {
        val contract = RepositoryGenerator(name)
        val impl = RepositoryImplGenerator(name)
        return listOf(contract, impl)
    }
}
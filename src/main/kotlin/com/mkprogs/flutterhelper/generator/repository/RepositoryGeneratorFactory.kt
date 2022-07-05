package com.mkprogs.flutterhelper.generator.repository

import com.mkprogs.flutterhelper.generator.repository.components.RepositoryImplGenerator
import com.mkprogs.flutterhelper.generator.repository.components.RepositoryGenerator

object RepositoryGeneratorFactory {
    fun getRepositoryGenerators(name: String): List<com.mkprogs.flutterhelper.generator.repository.RepositoryGenerator> {
        val contract = RepositoryGenerator(name)
        val impl = RepositoryImplGenerator(name)
        return listOf(contract, impl)
    }
}
package com.mkprogs.flutterhelper.generator.service

import com.mkprogs.flutterhelper.generator.service.components.ServiceImplGenerator
import com.mkprogs.flutterhelper.generator.service.components.ServiceGenerator

object ServiceGeneratorFactory {
    fun getServiceGenerators(name: String): List<com.mkprogs.flutterhelper.generator.service.ServiceGenerator> {
        val contract = ServiceGenerator(name)
        val impl = ServiceImplGenerator(name)
        return listOf(contract, impl)
    }
}
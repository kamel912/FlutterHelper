package com.mkprogs.flutterhelper.generator.service

import com.mkprogs.flutterhelper.generator.service.components.ServiceGenerator
import com.mkprogs.flutterhelper.generator.service.components.ServiceImplGenerator

object ServiceFileGeneratorFactory {
    fun getServiceGenerators(name: String): List<ServiceFileGenerator> {
        val contract = ServiceGenerator(name)
        val impl = ServiceImplGenerator(name)
        return listOf(contract, impl)
    }
}
package com.mkprogs.flutterhelper.actions.service

import com.intellij.openapi.actionSystem.AnActionEvent
import com.mkprogs.flutterhelper.actions.BaseGenerateAction
import com.mkprogs.flutterhelper.generator.service.ServiceFileGenerator
import com.mkprogs.flutterhelper.generator.service.ServiceFileGeneratorFactory
import com.mkprogs.flutterhelper.helpers.toLowerSnakeCase

class GenerateServiceAction : BaseGenerateAction<ServiceFileGenerator>(), GenerateServiceListener {
    override fun actionPerformed(e: AnActionEvent) {
        NewServiceDialog(this).showAndGet()
    }

    override fun onGenerateServiceClicked(name: String?) {
        name?.let {
            val generators = ServiceFileGeneratorFactory.getServiceGenerators(it)
            generate(generators, "Service", true, "${name.toLowerSnakeCase()}_service")
        }
    }
}
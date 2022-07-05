package com.mkprogs.flutterhelper.actions.service

import com.fleshgrinder.extensions.kotlin.toLowerCamelCase
import com.intellij.openapi.actionSystem.AnActionEvent
import com.mkprogs.flutterhelper.actions.BaseGenerateAction
import com.mkprogs.flutterhelper.generator.service.ServiceGenerator
import com.mkprogs.flutterhelper.generator.service.ServiceGeneratorFactory

class GenerateServiceAction : BaseGenerateAction<ServiceGenerator>(), GenerateServiceListener {
    override fun actionPerformed(e: AnActionEvent) {
        NewServiceDialog(this, ).showAndGet()
    }

    override fun onGenerateServiceClicked(name: String?) {
        name?.let {
            val generators = ServiceGeneratorFactory.getServiceGenerators(it)
            generate(generators, "Service" , true, "${name.toLowerCamelCase()}_service")
        }
    }
}
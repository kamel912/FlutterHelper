package com.mkprogs.flutterhelper.actions.service

import com.intellij.openapi.ui.DialogWrapper
import com.intellij.ui.dsl.builder.panel
import com.mkprogs.flutterhelper.helpers.dialogTitle
import com.mkprogs.flutterhelper.helpers.nameField
import javax.swing.JComponent

class NewServiceDialog(private val listener: GenerateServiceListener) :
    DialogWrapper(null) {
    val serviceModel = ServiceModel()

    init {
        title = dialogTitle("Service")
        init()
    }

    override fun createCenterPanel(): JComponent = panel {
        nameField(serviceModel::name, "Service")
    }

    override fun doOKAction() {
        super.doOKAction()
        listener.onGenerateServiceClicked(
            serviceModel.name
        )
    }

    class ServiceModel(var name: String = "")
}
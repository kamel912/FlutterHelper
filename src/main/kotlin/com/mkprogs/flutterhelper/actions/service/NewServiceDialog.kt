package com.mkprogs.flutterhelper.actions.service

import com.mkprogs.flutterhelper.actions.BaseDialog
import javax.swing.JComponent

class NewServiceDialog(private val generateServiceListener: GenerateServiceListener) :
    BaseDialog("Service", "Service name goes here (e.g. Network)") {

    init {
        init()
    }

    override fun buildContent(): JComponent? = null

    override fun doOKAction() {
        super.doOKAction()
        generateServiceListener.onGenerateServiceClicked(
            nameTextField.text
        )
    }
}
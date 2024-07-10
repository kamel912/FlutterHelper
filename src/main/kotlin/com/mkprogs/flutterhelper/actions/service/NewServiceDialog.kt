package com.mkprogs.flutterhelper.actions.service

import com.intellij.ui.dsl.builder.panel
import com.mkprogs.flutterhelper.actions.BaseDialog
import javax.swing.JComponent

class NewServiceDialog(private val listener: GenerateServiceListener) :
    BaseDialog("Service", "Service name goes here (e.g. Network)") {

    init {
        init()
    }

    override fun buildContent(): JComponent = panel {}

    override fun doOKAction() {
        super.doOKAction()
        listener.onGenerateServiceClicked(
            name
        )
    }
}
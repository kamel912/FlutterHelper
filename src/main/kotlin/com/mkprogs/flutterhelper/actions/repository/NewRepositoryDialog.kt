package com.mkprogs.flutterhelper.actions.repository

import com.intellij.ui.layout.panel
import com.mkprogs.flutterhelper.actions.BaseDialog
import javax.swing.JComponent

class NewRepositoryDialog(private val listener: GenerateRepositoryListener) :
    BaseDialog("", "Repository name goes here (e.g. User)") {

    init {
        init()
    }

    override fun buildContent(): JComponent = panel{}


    override fun doOKAction() {
        super.doOKAction()
        listener.onGenerateRepositoryClicked(
            nameTextField.text
        )
    }
}
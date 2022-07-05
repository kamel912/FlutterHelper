package com.mkprogs.flutterhelper.actions.repository

import com.mkprogs.flutterhelper.actions.BaseDialog
import javax.swing.JComponent

class NewRepositoryDialog(private val generateRepositoryListener: GenerateRepositoryListener) :
    BaseDialog("", "Repository name goes here (e.g. User)") {

    init {
        init()
    }

    override fun buildContent(): JComponent? = null


    override fun doOKAction() {
        super.doOKAction()
        generateRepositoryListener.onGenerateRepositoryClicked(
            nameTextField.text
        )
    }
}
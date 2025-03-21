package com.mkprogs.flutterhelper.actions.repository

import com.intellij.openapi.ui.DialogWrapper
import com.intellij.ui.dsl.builder.panel
import com.mkprogs.flutterhelper.helpers.dialogTitle
import com.mkprogs.flutterhelper.helpers.nameField
import javax.swing.JComponent

class NewRepositoryDialog(private val listener: GenerateRepositoryListener) :
    DialogWrapper(null) {

    val repositoryModel = RepositoryModel()

    init {

        title = dialogTitle("Repository")
        init()

    }

    override fun createCenterPanel(): JComponent {
        return panel {
            nameField(repositoryModel::name, "Repository")
        }
    }


    override fun doOKAction() {
        super.doOKAction()
        listener.onGenerateRepositoryClicked(
            repositoryModel.name
        )
    }

    class RepositoryModel(var name: String = "")

}
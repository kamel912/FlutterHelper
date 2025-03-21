package com.mkprogs.flutterhelper.actions.freezed

import com.intellij.openapi.ui.DialogWrapper
import com.intellij.ui.dsl.builder.panel
import com.mkprogs.flutterhelper.helpers.boundCheckBox
import com.mkprogs.flutterhelper.helpers.dialogTitle
import com.mkprogs.flutterhelper.helpers.nameField
import javax.swing.JComponent

class NewFreezedDialog(private val listener: GenerateFreezedListener) :
    DialogWrapper(null) {
    private val freezedModel: FreezedModel = FreezedModel()

    init {
        init()
        title = dialogTitle("Freezed Class")
    }


    override fun doOKAction() {
        super.doOKAction()

        listener.onGenerateFreezedClicked(
            freezedModel.name,
            freezedModel.useJson,
            freezedModel.useFolder,
        )
    }

    override fun createCenterPanel(): JComponent {

        return panel {
            nameField(freezedModel::name, "Freezed Class")
            row {
                boundCheckBox(freezedModel::useJson, "Add fromJson")
                boundCheckBox(freezedModel::useFolder, "Use folder")
            }
        }
    }

    data class FreezedModel(
        var name: String = "",
        var useJson: Boolean = false,
        var useFolder: Boolean = false,
    )
}
package com.mkprogs.flutterhelper.actions.freezed

import com.intellij.ui.dsl.builder.panel
import com.mkprogs.flutterhelper.actions.BaseDialog
import javax.swing.JCheckBox
import javax.swing.JComponent


class NewFreezedDialog(private val listener: GenerateFreezedListener) :
    BaseDialog("Freezed Class", "Freezed Class name goes here (e.g. User)") {
    private lateinit var useJsonCheckBox: JCheckBox
    private lateinit var useFolderCheckBox: JCheckBox


    init {
        init()
    }

    override fun doOKAction() {
        super.doOKAction()

        listener.onGenerateFreezedClicked(
            nameTextField.text,
            useJsonCheckBox.isSelected,
            useFolderCheckBox.isSelected,
        )
    }

    override fun buildContent(): JComponent {
        useJsonCheckBox = JCheckBox().apply {
            text = "Add fromJson"
        }
        useFolderCheckBox = JCheckBox().apply {
            text = "Use Folder"
        }

        return panel{
            row {
                cell(useJsonCheckBox)
                cell(useFolderCheckBox)
            }
        }
    }

}
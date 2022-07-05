package com.mkprogs.flutterhelper.actions.bloc

import com.intellij.ui.layout.panel
import com.mkprogs.flutterhelper.actions.BaseDialog
import java.awt.event.ActionListener
import javax.swing.JCheckBox
import javax.swing.JComponent


class NewBlocDialog(
    private val generateBlocListener: GenerateBlocListener,
    dialogTitle: String,
    toolTipText: String
) :
    BaseDialog(dialogTitle, toolTipText) {
    private lateinit var useFreezedCheckBox: JCheckBox
    private lateinit var useEquatableCheckBox: JCheckBox
    private lateinit var useFolderCheckBox: JCheckBox

    init {
        init()
    }

    override fun doOKAction() {
        super.doOKAction()
        generateBlocListener.onGenerateBlocClicked(
            nameTextField.text,
            useEquatableCheckBox.isSelected,
            useFreezedCheckBox.isSelected,
            useFolderCheckBox.isSelected
        )
    }


    override fun buildContent(): JComponent {
        useFreezedCheckBox = JCheckBox().apply {
            text = "Use Freezed"
        }
        useEquatableCheckBox = JCheckBox().apply {
            text = "Use Equatable"
        }
        useFolderCheckBox = JCheckBox().apply {
            text = "Use Folder"
        }

        val actionListener = ActionListener {
            useFreezedCheckBox.isEnabled = !useEquatableCheckBox.isSelected
            useEquatableCheckBox.isEnabled = !useFreezedCheckBox.isSelected
        }

        useFreezedCheckBox.addActionListener(actionListener)
        useEquatableCheckBox.addActionListener(actionListener)
        return panel {
            titledRow("Options:") {
                row("Operator:") {
                    useFreezedCheckBox()
                    useEquatableCheckBox()
                }
                row("Folder:") {
                    useFolderCheckBox()

                }
            }
        }
    }


    override fun getPreferredFocusedComponent(): JComponent = nameTextField
}
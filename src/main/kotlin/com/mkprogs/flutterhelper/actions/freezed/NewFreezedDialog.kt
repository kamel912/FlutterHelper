package com.mkprogs.flutterhelper.actions.freezed

import com.intellij.ui.dsl.builder.panel
import com.mkprogs.flutterhelper.actions.BaseDialog
import javax.swing.JCheckBox
import javax.swing.JComponent


class NewFreezedDialog(private val listener: GenerateFreezedListener) :
    BaseDialog("Freezed Class", "Freezed Class name goes here (e.g. User)") {
    private var useJson: Boolean = false
    private var useFolder: Boolean = false

    init {
        init()
    }

    override fun doOKAction() {
        super.doOKAction()

        listener.onGenerateFreezedClicked(
            name,
            useJson,
            useFolder,
        )
    }

    override fun buildContent(): JComponent {

        return panel {
            row {
                checkBox("Add fromJson")
                    .onChanged { component ->
                        useJson = component.isSelected
                    }
                checkBox("Use folder")
                    .onChanged { component ->
                        useFolder = component.isSelected
                    }
            }
        }
    }

}
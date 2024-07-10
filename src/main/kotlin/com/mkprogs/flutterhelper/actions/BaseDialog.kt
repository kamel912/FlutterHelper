package com.mkprogs.flutterhelper.actions

import com.intellij.openapi.ui.DialogWrapper
import com.intellij.ui.dsl.builder.panel
import javax.swing.JComponent

abstract class BaseDialog(dialogTitle: String, private val nameToolTipText: String) : DialogWrapper(null) {

    var name: String = ""

    init {
        title = "Generate $dialogTitle"
    }

    override fun createCenterPanel(): JComponent? {
        return panel {
            row("Name:") {
                textField().applyToComponent {
                    toolTipText = nameToolTipText
                }.onChanged { component ->
                    name = component.text
                }
            }
            row {
                cell(buildContent())
            }
        }
    }

    protected abstract fun buildContent(): JComponent

}
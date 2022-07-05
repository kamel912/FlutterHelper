package com.mkprogs.flutterhelper.actions

import com.intellij.openapi.ui.DialogWrapper
import com.intellij.ui.layout.panel
import javax.swing.JComponent
import javax.swing.JTextField

abstract class BaseDialog(private val dialogTitle: String, private val nameToolTipText: String, ) : DialogWrapper(null) {


    lateinit var nameTextField: JTextField

    init {
        title = "Generate $dialogTitle"
    }


    override fun createCenterPanel(): JComponent? {
        nameTextField = JTextField().apply {
            toolTipText = nameToolTipText
        }
        return panel {
            row("Name:") {
                nameTextField()
            }

            row {
                buildContent()!!()
            }
        }
    }

    protected abstract fun buildContent(): JComponent?

    override fun getPreferredFocusedComponent(): JComponent? = nameTextField

}
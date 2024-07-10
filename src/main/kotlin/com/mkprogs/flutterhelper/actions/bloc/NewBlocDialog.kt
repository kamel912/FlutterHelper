package com.mkprogs.flutterhelper.actions.bloc

import com.intellij.ui.dsl.builder.panel
import com.mkprogs.flutterhelper.actions.BaseDialog
import javax.swing.JComponent


class NewBlocDialog(
    private val listener: GenerateBlocListener,
    dialogTitle: String,
    toolTipText: String
) :
    BaseDialog(dialogTitle, toolTipText) {
    private var equalityType: EqualityType = EqualityType.INITIAL
    private var useFolder: Boolean = false


    init {
        init()
    }

    override fun doOKAction() {
        super.doOKAction()
        listener.onGenerateBlocClicked(
            name,
            equalityType,
            useFolder,
        )
    }


    override fun buildContent(): JComponent {


        return panel {
            group("Options:") {
                buttonsGroup("Operator:") {
                    row {
                        radioButton("Use freezed")
                            .onChanged { component ->
                                run {
                                    if (component.isSelected) equalityType = EqualityType.FREEZED
                                }
                            }
                    }
                    row {
                        radioButton("Use equatable")
                            .onChanged { component ->
                                run {
                                    if (component.isSelected) equalityType = EqualityType.EQUITABLE
                                }
                            }
                    }
                }
                row("Folder:") {
                    checkBox("Use folder").onChanged { value ->
                        run {
                            useFolder = value.isSelected

                        }
                    }
                }
            }
        }
    }


}
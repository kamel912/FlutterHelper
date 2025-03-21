package com.mkprogs.flutterhelper.actions.bloc

import com.intellij.openapi.ui.DialogWrapper
import com.intellij.ui.dsl.builder.TopGap
import com.intellij.ui.dsl.builder.panel
import com.mkprogs.flutterhelper.helpers.boundCheckBox
import com.mkprogs.flutterhelper.helpers.dialogTitle
import com.mkprogs.flutterhelper.helpers.enumGroup
import com.mkprogs.flutterhelper.helpers.nameField
import javax.swing.JComponent

class NewBlocDialog(
    private val listener: GenerateBlocListener,
    private val dialogName: String,
) : DialogWrapper(null) {

    private val blocModel: BlocModel = BlocModel()

    init {
        title = dialogTitle(dialogName)
        init()
    }

    override fun doOKAction() {
        super.doOKAction()
        listener.onGenerateBlocClicked(
            blocModel.name,
            blocModel.equalityType,
            blocModel.useFolder,
        )
    }


    override fun createCenterPanel(): JComponent = panel {
        nameField(blocModel::name, dialogName)
        group("Options:") {
            enumGroup<EqualityType>(
                "Operator:",
                blocModel::equalityType,
            )
            row("Folder:") {
                boundCheckBox(
                    blocModel::useFolder,
                    "Use folder",
                )
            }
        }.topGap(TopGap.NONE)
    }

    data class BlocModel(
        var name: String = "",
        var equalityType: EqualityType = EqualityType.None,
        var useFolder: Boolean = false,
    )
}


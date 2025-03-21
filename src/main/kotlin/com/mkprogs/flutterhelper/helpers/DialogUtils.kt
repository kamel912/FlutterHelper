package com.mkprogs.flutterhelper.helpers

import com.intellij.ui.components.JBCheckBox
import com.intellij.ui.dsl.builder.*
import com.mkprogs.flutterhelper.actions.bloc.EqualityType
import kotlin.reflect.KMutableProperty0

/**
 * Creates a labeled text field with binding to a string property
 * @param property The property to bind the text field to
 * @param tooltip Optional tooltip text for the field
 * @return The cell containing the text field
 */

fun Panel.nameField(
    property: KMutableProperty0<String>,
    tooltip: String,
): Row {
    return row("Name:") {
        textField().bindText(property).also { cell ->
            cell.applyToComponent {
                toolTipText = "$tooltip name goes here (e.g. Login)"
            }
        }
    }
}

/**
 * Creates a checkbox with binding to a boolean property
 * @param checkboxText The checkbox text to display
 * @param property The property to bind the checkbox to
 * @return The cell containing the text field
 */

fun Row.boundCheckBox(
    property: KMutableProperty0<Boolean>,
    checkboxText: String,
): Cell<JBCheckBox> {
    return checkBox(checkboxText).bindSelected(property)
}

/**
 * Creates a checkbox with binding to a boolean property
 * @param property The property to bind the checkbox to
 * @return The cell containing the text field
 */

inline fun < reified  T : Enum<T>> Panel.enumGroup(
    groupTitle: String? = null,
    property: KMutableProperty0<T>,
): ButtonsGroup {
    val entries = enumValues<T>().toList()
    return buttonsGroup(groupTitle) {
        for (item in entries) {
            row {
                radioButton(item.name, item)
            }
        }
    }.bind(property)
}

fun dialogTitle(title: String): String = "Generate $title"
package com.mkprogs.flutterhelper.actions.bloc

interface GenerateBlocListener {
    fun onGenerateBlocClicked(name: String?, useEquatable: Boolean, useFreezed: Boolean, useFolder: Boolean)
}
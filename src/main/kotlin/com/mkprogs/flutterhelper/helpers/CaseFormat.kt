package com.mkprogs.flutterhelper.helpers


fun String.toUpperCamelCase(vararg ignore: Char): String =
    if (this.isEmpty()) this else StringBuilder(this.length).also {
        var seenSeparator = true
        var seenUpperCase = false

        this.forEach { c ->
            when (c) {
                in ignore -> {
                    it.append(c)
                    seenSeparator = true
                    seenUpperCase = false
                }

                in '0'..'9' -> {
                    it.append(c)
                    seenSeparator = false
                    seenUpperCase = false
                }

                in 'a'..'z' -> {
                    it.append(if (seenSeparator) c.uppercaseChar() else c)
                    seenSeparator = false
                    seenUpperCase = false
                }

                in 'A'..'Z' -> {
                    it.append(if (seenUpperCase) c.lowercaseChar() else c)
                    seenSeparator = false
                    seenUpperCase = true
                }

            }
        }
    }.toString()


fun String.toLowerSnakeCase(vararg ignore: Char): String =
    if (this.isEmpty()) this else StringBuilder(this.length).also {
        var seenSeparator = true
        var seenUpperCase = false

        this.forEach { c ->
            when (c) {
                in ignore -> {
                    it.append(c)
                    seenSeparator = true
                    seenUpperCase = false
                }

                in '0'..'9' -> {
                    it.append(c)
                    seenSeparator = false
                    seenUpperCase = false
                }

                in 'a'..'z' -> {
                    it.append(c)
                    seenSeparator = false
                    seenUpperCase = false
                }

                in 'A'..'Z' -> {
                    if (!seenSeparator && !seenUpperCase) it.append('_')
                    it.append(c.lowercaseChar())
                    seenSeparator = false
                    seenUpperCase = true
                }
            }
        }
    }.toString()



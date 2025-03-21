package com.mkprogs.flutterhelper.generator

import com.google.common.io.CharStreams
import com.mkprogs.flutterhelper.helpers.toLowerSnakeCase
import com.mkprogs.flutterhelper.helpers.toUpperCamelCase
import org.apache.commons.text.StringSubstitutor
import java.io.InputStreamReader
import java.util.*

abstract class BaseFileGenerator(
    templateName: String,
    templateFolder: String,
    private val typeName: String,
    private val name: String,
) {


    abstract fun fileName(): String


    private val templateString: String
    lateinit var templateValues: MutableMap<String, String>

    fun generate(): String {
        val substitutor = StringSubstitutor(templateValues)
        return substitutor.replace(templateString)
    }

    init {

        try {
            val resource = "/templates/$templateFolder/$templateName.dart.template"
            val resourceAsStream = this::class.java.getResourceAsStream(resource)
            templateString = CharStreams.toString(InputStreamReader(resourceAsStream!!, Charsets.UTF_8))
        } catch (e: Exception) {
            throw RuntimeException(e)
        }

    }


    fun pascalCase(): String = name.toUpperCamelCase().replace(typeName, "")

    fun snakeCase(): String = name.toLowerSnakeCase().replace("_${typeName.lowercase(Locale.ENGLISH)}", "")


    fun dollarSignCase(): String = "$${pascalCase()}"

    fun fileExtension() = "dart"


}
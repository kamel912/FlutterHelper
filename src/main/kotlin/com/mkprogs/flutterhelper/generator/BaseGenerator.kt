package com.mkprogs.flutterhelper.generator

import com.google.common.io.CharStreams
import org.apache.commons.lang.text.StrSubstitutor
import java.io.InputStreamReader

abstract class BaseGenerator(
    templateName: String,
    templateFolder: String,
) {


    abstract fun fileName(): String


    private val templateString: String
    lateinit var templateValues: MutableMap<String, String>

    fun generate(): String {
        val substitutor = StrSubstitutor(templateValues)
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


    abstract fun pascalCase(): String

    abstract fun snakeCase(): String


    fun dollarSignCase(): String = "$${pascalCase()}"

    fun fileExtension() = "dart"



}
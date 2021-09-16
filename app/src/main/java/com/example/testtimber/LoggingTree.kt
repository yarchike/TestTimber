package com.example.testtimber


import android.util.Log
import timber.log.Timber

open class LoggingTree : Timber.DebugTree() {

    override fun createStackElementTag(element: StackTraceElement): String {
        return "yar/" +
//                "${element.className}." +
                "${element.methodName}${if (element.isNativeMethod) "*native*" else ""}" +
                "(${element.fileName}:${element.lineNumber})"
    }

}

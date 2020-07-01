package org.http4k.serverless

import dev.forkhandles.bunting.use

object InvokeAction {
    @JvmStatic
    fun main(args: Array<String>) =
        OpenWhiskCliFlags(args).use {
            openWhiskClient().invokeActionInPackage(namespace, packageName, actionName, emptyMap(), "true", "true")
        }
}
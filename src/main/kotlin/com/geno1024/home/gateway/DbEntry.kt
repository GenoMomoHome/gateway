package com.geno1024.home.gateway

import java.net.ServerSocket

object DbEntry
{
    @JvmStatic
    fun main(args: Array<String>)
    {
        val server = ServerSocket(17474) /* DB -> 0x4442 */
        while (true)
        {
            val socket = server.accept()

        }
    }
}

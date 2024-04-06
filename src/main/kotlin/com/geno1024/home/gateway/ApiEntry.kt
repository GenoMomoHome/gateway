package com.geno1024.home.gateway

import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress

object ApiEntry
{
    @JvmStatic
    fun main(args: Array<String>)
    {
        HttpServer.create(InetSocketAddress(18253), 10).apply { /* GM -> 0x474d */
            createContext("/register") {

            }
            createContext("/") {

            }
            start()
        }
    }
}

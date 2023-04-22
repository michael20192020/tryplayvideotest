package com.hansoft.tryplayvideotest

class YourThread : Runnable {
    override fun run() {
        Thread.sleep(4000)
        println("welcome")
    }
}
package com.hansoft.tryplayvideotest

class MyThread : Thread() {
    override fun run() {
        super.run()
        sleep(5000)
        println("hello")
    }
}
package com.hansoft.tryplayvideotest

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun infix_test()
    {
        if ("Hello Kotlin" beginsWith "Hello")
        {
            println("hello kotlin start with hello")
        }

        val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
        if (list has "Banana") {
            println("list has banana")
        }

        val map = mapOf("Apple" with 1, "Banana" with 2, "Orange" with 3, "Pear" with 4,
            "Grape" with 5)
        println(map)
    }

    @Test
    fun thread_test()
    {
        MyThread().start()
        val yourThread = YourThread()
        Thread(yourThread).start()
        Thread.sleep(8000)
    }
}
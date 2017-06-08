package com.example.ronalddaugherty.weatherappexample

import android.util.Log
import java.net.URL

/**
 * Created by ronalddaugherty on 6/6/17.
 */
class Request(val url: String) {

    fun run() {
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonStr)
    }
}
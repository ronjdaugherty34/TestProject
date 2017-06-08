package com.example.ronalddaugherty.weatherappexample.ui

import android.app.Application
import com.example.ronalddaugherty.weatherappexample.ui.utils.DelegatesExt

/**
 * Created by ronalddaugherty on 6/7/17.
 */
class App : Application() {

    companion object {
        var instance: App by DelegatesExt.notNullSingleValue()
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}
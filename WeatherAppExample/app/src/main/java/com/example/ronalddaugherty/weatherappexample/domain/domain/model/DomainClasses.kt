package com.example.ronalddaugherty.weatherappexample.domain.domain.model

import java.lang.reflect.Array.get

/**
 * Created by ronalddaugherty on 6/7/17.
 */

data class ForecastList(val id: Long, val city: String, val country: String,
                        val dailyForecast: List<Forecast>) {

    val size: Int
        get() = dailyForecast.size

    operator fun get(position: Int) = dailyForecast[position]
}

data class Forecast(val date: Long, val description: String, val high: Int, val low: Int,
                    val iconUrl: String)

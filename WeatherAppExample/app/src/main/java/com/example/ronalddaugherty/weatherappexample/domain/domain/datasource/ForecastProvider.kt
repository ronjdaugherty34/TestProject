package com.example.ronalddaugherty.weatherappexample.domain.domain.datasource

import com.example.ronalddaugherty.weatherappexample.data.db.ForecastDb
import com.example.ronalddaugherty.weatherappexample.data.db.server.ForecastServer
import com.example.ronalddaugherty.weatherappexample.domain.domain.model.ForecastList
import com.example.ronalddaugherty.weatherappexample.extensions.firstResult

/**
 * Created by ronalddaugherty on 6/7/17.
 */
class ForecastProvider(val sources: List<ForecastDataSource> = ForecastProvider.SOURCES) {

    companion object {
        val DAY_IN_MILLIS = 1000 * 60 * 60 * 24
        val SOURCES = listOf(ForecastDb(), ForecastServer())
    }

    fun requestByZipCode(zipCode: Long, days: Int): ForecastList
            = sources.firstResult { requestSource(it, days, zipCode) }

    private fun requestSource(source: ForecastDataSource, days: Int, zipCode: Long): ForecastList? {
        val res = source.requestForecastByZipCode(zipCode, todayTimeSpan())
        return if (res != null && res.size >= days) res else null
    }

    private fun todayTimeSpan() = System.currentTimeMillis() / DAY_IN_MILLIS * DAY_IN_MILLIS
}
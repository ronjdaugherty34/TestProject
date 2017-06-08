package com.example.ronalddaugherty.weatherappexample.data.db.server

import com.example.ronalddaugherty.weatherappexample.data.db.ForecastDb
import com.example.ronalddaugherty.weatherappexample.domain.domain.model.ForecastList

/**
 * Created by ronalddaugherty on 6/7/17.
 */

class ForecastServer(val dataMapper: ServerDataMapper = ServerDataMapper(),
                     val forecastDb: ForecastDb = ForecastDb()) : ForecastDataSource {

    override fun requestForecastByZipCode(zipCode: Long, date: Long): ForecastList? {
        val result = ForecastByZipCodeRequest(zipCode).execute()
        val converted = dataMapper.convertToDomain(zipCode, result)
        forecastDb.saveForecast(converted)
        return forecastDb.requestForecastByZipCode(zipCode, date)
    }
}
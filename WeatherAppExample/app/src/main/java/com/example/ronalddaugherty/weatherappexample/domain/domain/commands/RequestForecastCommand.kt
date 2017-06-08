package com.example.ronalddaugherty.weatherappexample.domain.domain.commands

import com.example.ronalddaugherty.weatherappexample.data.db.server.ForecastRequest
import com.example.ronalddaugherty.weatherappexample.domain.domain.mappers.ForecastDataMapper
import com.example.ronalddaugherty.weatherappexample.domain.domain.model.ForecastList

/**
 * Created by ronalddaugherty on 6/7/17.
 */
class RequestForecastCommand(
        val zipCode: Long,
        val forecastProvider: ForecastProvider = ForecastProvider()) :
        Command<ForecastList> {

    companion object {
        val DAYS = 7
    }

    override fun execute(): ForecastList {
        return forecastProvider.requestByZipCode(zipCode, DAYS)
    }
}
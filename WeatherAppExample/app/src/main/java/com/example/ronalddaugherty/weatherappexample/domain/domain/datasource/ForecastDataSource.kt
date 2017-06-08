package com.example.ronalddaugherty.weatherappexample.domain.domain.datasource

import com.example.ronalddaugherty.weatherappexample.domain.domain.model.ForecastList

/**
 * Created by ronalddaugherty on 6/7/17.
 */
interface ForecastDataSource {

    fun requestForecastByZipCode (zipCode: Long, date: Long):ForecastList?
}
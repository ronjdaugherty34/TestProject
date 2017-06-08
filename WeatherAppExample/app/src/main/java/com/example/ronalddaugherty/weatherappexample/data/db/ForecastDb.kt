package com.example.ronalddaugherty.weatherappexample.data.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.text.method.TextKeyListener.clear
import com.example.ronalddaugherty.weatherappexample.domain.domain.model.ForecastList
import com.example.ronalddaugherty.weatherappexample.extensions.clear
import com.example.ronalddaugherty.weatherappexample.extensions.parseList
import com.example.ronalddaugherty.weatherappexample.extensions.parseOpt
import com.example.ronalddaugherty.weatherappexample.extensions.toVarargArray
import com.example.ronalddaugherty.weatherappexample.ui.App
import org.jetbrains.anko.db.*
import java.util.*
import org.jetbrains.anko.db.insert
import org.jetbrains.anko.db.select



/**
 * Created by ronalddaugherty on 6/7/17.
 */
class ForecastDb(val forecastDbHelper: ForecastDbHelper = ForecastDbHelper.instance,
                 val dataMapper: DbDataMapper = DbDataMapper()) : ForecastDataSource {

    override fun requestForecastByZipCode(zipCode: Long, date: Long) = forecastDbHelper.use {

        val dailyRequest = "${DayForecastTable.CITY_ID} = ? AND ${DayForecastTable.DATE} >= ?"
        val dailyForecast = select(DayForecastTable.NAME)
                .whereSimple(dailyRequest, zipCode.toString(), date.toString())
                .parseList { DayForecast(HashMap(it)) }

        val city = select(CityForecastTable.NAME)
                .whereSimple("${CityForecastTable.ID} = ?", zipCode.toString())
                .parseOpt { CityForecast(HashMap(it), dailyForecast) }

        if (city != null) dataMapper.convertToDomain(city) else null
    }

    fun saveForecast(forecast: ForecastList) = forecastDbHelper.use {

        clear(CityForecastTable.NAME)
        clear(DayForecastTable.NAME)

        with(dataMapper.convertFromDomain(forecast)) {
            insert(CityForecastTable.NAME, *map.toVarargArray())
            dailyForecast.forEach { insert(DayForecastTable.NAME, *it.map.toVarargArray()) }
        }
    }
}
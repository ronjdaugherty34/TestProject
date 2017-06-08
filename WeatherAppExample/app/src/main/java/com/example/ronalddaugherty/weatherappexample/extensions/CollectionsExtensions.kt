package com.example.ronalddaugherty.weatherappexample.extensions

/**
 * Created by ronalddaugherty on 6/7/17.
 */
fun <K, V : Any> Map<K, V?>.toVarargArray(): Array<out Pair<K, V>> =
        map({ Pair(it.key, it.value!!) }).toTypedArray()
package com.example.ronalddaugherty.weatherappexample.domain.domain.commands

/**
 * Created by ronalddaugherty on 6/7/17.
 */
public interface Command <out T> {
    fun execute ():T
}
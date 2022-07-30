package com.uduak.myapplication

import androidx.lifecycle.MutableLiveData
import kotlin.random.Random

class ForcastRepository {
    private val _weeklyForcast = MutableLiveData<List<DailyForcast>>()
    val weaklyForcast = _weeklyForcast


    fun loadForcast(Zipcode:String){
        val RandomValues = List(7){ Random.nextFloat().rem(100)*100}

        val forecastItems= RandomValues.map {temprature ->
            DailyForcast(temprature, "partly cloudy")
        }
        _weeklyForcast.setValue(forecastItems)

    }
}
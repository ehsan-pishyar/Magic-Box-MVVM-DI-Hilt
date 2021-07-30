package com.example.data.util

import java.util.concurrent.TimeUnit

object TimeUtil {

    fun isTimeSurpassed(timeInterval: Long, savedTime: Long, currentTime: Long): Boolean {
        val saved = TimeUnit.MILLISECONDS.toMinutes(savedTime)
        val current = TimeUnit.MILLISECONDS.toMinutes(currentTime)
        val interval = TimeUnit.HOURS.toMinutes(timeInterval)

        val difference = current - saved
        return difference > interval
    }
}
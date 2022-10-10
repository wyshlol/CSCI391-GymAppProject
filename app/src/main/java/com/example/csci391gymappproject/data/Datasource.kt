package com.example.csci391gymappproject.data

import com.example.csci391gymappproject.R
import com.example.csci391gymappproject.model.Workout


class Datasource {

    fun loadWorkoutPull(): List<Workout> {
        return listOf<Workout>(
            Workout(R.string.pullday1),
            Workout(R.string.pullday2),
            Workout(R.string.pullday3),
            Workout(R.string.pullday4),
            Workout(R.string.pullday5),
            Workout(R.string.pullday6)
        )
    }

    fun loadWorkoutPush(): List<Workout> {
        return listOf<Workout>(
            Workout(R.string.pushday1),
            Workout(R.string.pushday2),
            Workout(R.string.pushday3),
            Workout(R.string.pushday4),
            Workout(R.string.pushday5),
            Workout(R.string.pushday6)
        )
    }

    fun loadWorkoutLegs(): List<Workout> {
        return listOf<Workout>(
            Workout(R.string.legsday1),
            Workout(R.string.legsday2),
            Workout(R.string.legsday3),
            Workout(R.string.legsday4),
            Workout(R.string.legsday5),
            Workout(R.string.legsday6)
        )
    }
}
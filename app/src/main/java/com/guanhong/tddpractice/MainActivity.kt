package com.guanhong.tddpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG = "Huang"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weather: IWeather = Weather()
        val umbrella = Umbrella()
        val test = umbrella.totalPrice(weather, 5, 600)

        Log.d(TAG, " test " + test)
    }
}

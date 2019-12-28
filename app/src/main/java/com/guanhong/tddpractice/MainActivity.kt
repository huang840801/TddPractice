package com.guanhong.tddpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weather: IWeather = Weather()
        val umbrella = Umbrella()
        val test = umbrella.totalPrice(weather, 5, 600)

    }
}

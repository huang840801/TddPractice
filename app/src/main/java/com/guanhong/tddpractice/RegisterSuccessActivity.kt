package com.guanhong.tddpractice

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterSuccessActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_success)

        Toast.makeText(this, "註冊成功", Toast.LENGTH_SHORT).show()
    }
}
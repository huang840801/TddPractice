package com.guanhong.tddpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        registerButton.setOnClickListener {

            val isAccountCorrect = RegisterVerify().isAccountCorrect(account.text.toString())
            val isPasswordCorrect = RegisterVerify().isPasswordCorrect(password.text.toString())

            val message = if (isAccountCorrect && isPasswordCorrect) {
                "註冊成功"
            } else {
                "註冊失敗"
            }
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
    }
}

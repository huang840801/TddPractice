package com.guanhong.tddpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.guanhong.tddpractice.product.ProductActivity
import kotlinx.android.synthetic.main.activity_main.*
import tddpracticesample.Repository

class MainActivity : AppCompatActivity() {

    private lateinit var repository: MainRepository
    private lateinit var sharedPreferenceManager: SharedPreferenceManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val test = LeetCode().mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", arrayOf("hit"))

        Log.d("Huang"," aaa "+ test)

        sharedPreferenceManager = SharedPreferenceManager(this)

        repository = MainRepository(sharedPreferenceManager)

        registerButton.setOnClickListener {

            val isAccountCorrect = RegisterVerify().isAccountCorrect(account.text.toString())
            val isPasswordCorrect = RegisterVerify().isPasswordCorrect(password.text.toString())

            if (isAccountCorrect && isPasswordCorrect) {

                repository.saveUserAccount(account.text.toString())

                startActivity(Intent(this, RegisterSuccessActivity::class.java))
            } else {

                Toast.makeText(this, "註冊失敗", Toast.LENGTH_SHORT).show()
            }
        }

//        startActivity(Intent(this, ProductActivity::class.java))
    }
}

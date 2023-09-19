package com.example.tugaspertemuan5

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugaspertemuan5.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val usernameAkun = intent.extras?.getString("Username")
        val emailAkun = intent.extras?.getString("Email")
        val phoneAkun = intent.extras?.getString("Phone")
        val passwordAkun = intent.extras?.getString("Password")
        with(binding){
            if (usernameAkun != null){
                btnLogin.setOnClickListener {
                    val intentToSecondActivity =
                        Intent(this@MainActivity3, MainActivity2::class.java)
                    if (username.text.toString() != usernameAkun || password.text.toString() != passwordAkun){
                        warnError.text = "- akun salah -"
                    } else {
                        val extras = Bundle()
                        extras.putString("Username", usernameAkun)
                        extras.putString("Email", emailAkun)
                        extras.putString("Phone", phoneAkun)
                        extras.putString("Password", passwordAkun)
                        intentToSecondActivity.putExtras(extras)
                        startActivity(intentToSecondActivity)
                    }
                }
            }
            else {
                warnError.text = "- akun belum terdaftar -"
            }
            btnRegister.setOnClickListener {
                val intentToMainActivity =
                    Intent(this@MainActivity3, MainActivity::class.java)
                startActivity(intentToMainActivity)
            }
        }
    }
}
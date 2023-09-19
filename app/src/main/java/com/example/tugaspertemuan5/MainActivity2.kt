package com.example.tugaspertemuan5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugaspertemuan5.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val username = intent.extras?.getString("Username")
        val emailAkun = intent.extras?.getString("Email")
        val phoneAkun = intent.extras?.getString("Phone")
        with(binding){
            name.text = username
            email.text = emailAkun
            phone.text = phoneAkun
        }
    }
}
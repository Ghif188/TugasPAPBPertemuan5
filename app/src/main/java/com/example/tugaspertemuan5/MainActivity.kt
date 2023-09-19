package com.example.tugaspertemuan5

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tugaspertemuan5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            val intentToThirdActivity =
                Intent(this@MainActivity, MainActivity3::class.java)
            btnRegister.setOnClickListener {
                val extras = Bundle()
                if (username.text.toString() == "" || email.text.toString() == "" || phone.text.toString() == "" || password.text.toString() == ""){
                    warnError.text = "- kolom wajib terisi semua -"
                } else {
                    extras.putString("Username", username.text.toString())
                    extras.putString("Email", email.text.toString())
                    extras.putString("Phone", phone.text.toString())
                    extras.putString("Password", password.text.toString())
                    intentToThirdActivity.putExtras(extras)
                    startActivity(intentToThirdActivity)
                }
            }
            btnLogin.setOnClickListener{
                startActivity(intentToThirdActivity)
            }
        }

    }
}

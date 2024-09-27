package com.akirachix.dishhub

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.dishhub.databinding.ActivityTeaserscreenBinding
import com.akirachix.dishhub.ui.Signup

class Teaserscreen : AppCompatActivity() {

    private lateinit var binding: ActivityTeaserscreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTeaserscreenBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.tvLogin.setOnClickListener {
            Log.d("Teaserscreen", "Already have an account?log in clicked")
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
        }

        binding.btnbutton.setOnClickListener {
            Log.d("Teaserscreen", "Get Started button clicked") // Log click event
            val intent = Intent(this,Signup::class.java)
            startActivity(intent)
        }


    }
}




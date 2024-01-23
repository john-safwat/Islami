package com.john.islamiandroid.UI.Splash

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.john.islamiandroid.UI.Home.MainActivity
import com.john.islamiandroid.databinding.ActivitySplashBinding


@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // view binding for the XML activity_splash view to add functions to it
        binding = ActivitySplashBinding.inflate(layoutInflater)
        // render the content of the activity_splash in the screen
        setContentView(binding.root)
        // create splash screen
        Handler().postDelayed({navigateToMainActivity() }, 2000)
    }


    // function to navigate to to the home screen after splash time end
    private fun navigateToMainActivity(){
        val intent = Intent(this@SplashActivity, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

}
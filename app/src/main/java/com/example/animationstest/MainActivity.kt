package com.example.animationstest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val streetsImage1: ImageView = findViewById(R.id.streets)
        val streetsImage2: ImageView = findViewById(R.id.streets2)

        val streetAnim1: Animation = AnimationUtils.loadAnimation(this, R.anim.streets1)
        streetsImage1.startAnimation(streetAnim1)

        val streetAnim2: Animation = AnimationUtils.loadAnimation(this, R.anim.streets2)
        streetsImage2.startAnimation(streetAnim2)

        val newsImage1: ImageView = findViewById(R.id.news1)
        val newsAnim1: Animation = AnimationUtils.loadAnimation(this, R.anim.news1)
        newsImage1.startAnimation(newsAnim1)

        Handler(Looper.getMainLooper()).postDelayed({
            val newsImage2: ImageView = findViewById(R.id.news2)
            val newsAnim2: Animation = AnimationUtils.loadAnimation(this, R.anim.news2)
            newsImage2.startAnimation(newsAnim2)
        }, 1000)

        Handler(Looper.getMainLooper()).postDelayed({
            val newsImage3: ImageView = findViewById(R.id.news3)
            val newsAnim3: Animation = AnimationUtils.loadAnimation(this, R.anim.news3)
            newsImage3.startAnimation(newsAnim3)
        }, 2000)
    }
}
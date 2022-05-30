package com.example.localizationandinternationalization

import android.animation.ValueAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val view = findViewById<TextView>(R.id.text_view)
        val animator = ValueAnimator.ofInt(0, 600)
        animator.duration = 100000 // 5 seconds
        animator.addUpdateListener { animation ->
            view.text = animation.animatedValue.toString()
        }
        animator.start()
    }


}
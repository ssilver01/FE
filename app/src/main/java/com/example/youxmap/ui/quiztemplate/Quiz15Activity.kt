package com.example.youxmap.ui.quiztemplate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.youxmap.databinding.ActivityQuiz11Binding

class Quiz15Activity : AppCompatActivity() {
    private lateinit var binding: ActivityQuiz15Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuiz15Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }


}
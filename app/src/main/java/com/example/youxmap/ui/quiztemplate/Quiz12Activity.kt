package com.example.youxmap.ui.quiztemplate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.youxmap.databinding.ActivityQuiz11Binding
import com.example.youxmap.databinding.ActivityQuiz12Binding

class Quiz12Activity : AppCompatActivity() {
    private lateinit var binding: ActivityQuiz12Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuiz12Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
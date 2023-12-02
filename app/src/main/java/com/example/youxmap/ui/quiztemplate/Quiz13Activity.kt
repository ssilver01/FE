package com.example.youxmap.ui.quiztemplate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.youxmap.databinding.ActivityQuiz11Binding
import com.example.youxmap.databinding.ActivityQuiz13Binding

class Quiz13Activity : AppCompatActivity() {
    private lateinit var binding: ActivityQuiz13Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuiz13Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
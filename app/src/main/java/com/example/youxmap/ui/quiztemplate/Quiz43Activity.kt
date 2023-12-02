package com.example.youxmap.ui.quiztemplate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.youxmap.databinding.ActivityQuiz11Binding
import com.example.youxmap.databinding.ActivityQuiz43Binding

class Quiz43Activity : AppCompatActivity() {
    private lateinit var binding: ActivityQuiz43Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuiz43Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }


}
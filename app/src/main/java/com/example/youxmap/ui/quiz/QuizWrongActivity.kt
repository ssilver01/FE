package com.example.youxmap.ui.quiz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.youxmap.databinding.ActivityQuizAnswerBinding
import com.example.youxmap.databinding.ActivityQuizWrongBinding

class QuizWrongActivity : AppCompatActivity() {
    lateinit var binding: ActivityQuizWrongBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizWrongBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
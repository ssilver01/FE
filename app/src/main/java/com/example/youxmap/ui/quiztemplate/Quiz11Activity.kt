package com.example.youxmap.ui.quiztemplate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.youxmap.databinding.ActivityQuiz11Binding
import com.example.youxmap.databinding.ActivityQuizAnswerBinding

class Quiz11Activity : AppCompatActivity() {
    private lateinit var binding: ActivityQuiz11Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuiz11Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}
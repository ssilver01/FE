package com.example.youxmap.ui.quiztemplate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.youxmap.databinding.ActivityQuiz11Binding
import com.example.youxmap.databinding.ActivityQuiz41Binding

class Quiz41Activity : AppCompatActivity() {
    private lateinit var binding: ActivityQuiz41Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuiz41Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }


}
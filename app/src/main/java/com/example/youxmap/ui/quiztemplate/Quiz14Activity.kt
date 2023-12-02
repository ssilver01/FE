package com.example.youxmap.ui.quiztemplate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.youxmap.databinding.ActivityQuiz11Binding

class Quiz14Activity : AppCompatActivity() {
    private lateinit var binding: ActivityQuiz14Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuiz14Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }


}
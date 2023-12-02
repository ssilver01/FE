package com.example.youxmap.ui.quiztemplate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.youxmap.databinding.ActivityQuiz11Binding
import com.example.youxmap.databinding.ActivityQuiz42Binding

class Quiz42Activity : AppCompatActivity() {
    private lateinit var binding: ActivityQuiz42Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuiz42Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}
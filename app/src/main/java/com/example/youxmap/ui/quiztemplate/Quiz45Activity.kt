package com.example.youxmap.ui.quiztemplate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.youxmap.databinding.ActivityQuiz11Binding

class Quiz45Activity : AppCompatActivity() {
    private lateinit var binding: ActivityQuiz45Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuiz45Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }


}
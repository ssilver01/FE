package com.example.youxmap.ui.quiz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.youxmap.databinding.ActivityQuizAnswerBinding

class QuizAnswerActivity : AppCompatActivity(){
    private lateinit var binding: ActivityQuizAnswerBinding
    //미사용
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizAnswerBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


}
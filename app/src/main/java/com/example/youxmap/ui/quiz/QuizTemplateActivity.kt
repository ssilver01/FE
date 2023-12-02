package com.example.youxmap.ui.quiz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.youxmap.databinding.ActivityQuizTempletBinding

class QuizTemplateActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuizTempletBinding
    //미사용
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizTempletBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
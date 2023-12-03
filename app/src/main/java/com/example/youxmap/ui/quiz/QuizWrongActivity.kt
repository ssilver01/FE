package com.example.youxmap.ui.quiz

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.youxmap.databinding.ActivityQuiz11AnswerBinding
import com.example.youxmap.databinding.ActivityQuizAnswerBinding
import com.example.youxmap.databinding.ActivityQuizWrongBinding

class QuizWrongActivity : AppCompatActivity() {
    lateinit var binding: ActivityQuizWrongBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizWrongBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val coin = intent.getIntExtra("coin", -1)
        val total_coin = intent.getIntExtra("total_coin", -1)

        binding.vWrongBtn.setOnClickListener {
            val i = Intent(this, ActivityQuiz11AnswerBinding::class.java)
            i.putExtra("coin", coin)
            i.putExtra("total_coin", total_coin)
            startActivity(i)
            finish()
        }
    }
}
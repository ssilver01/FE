package com.example.youxmap.ui.quiztemplate

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.youxmap.R
import com.example.youxmap.databinding.ActivityQuiz12AnswerBinding
import com.example.youxmap.databinding.ActivityQuiz12Binding
import com.example.youxmap.databinding.ActivityQuiz13Binding

class Quiz12AnswerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuiz12AnswerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuiz12AnswerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val answer = intent.getStringExtra("answer")
        val coin = intent.getIntExtra("coin", -1)
        val total_coin = intent.getIntExtra("total_coin", -1)

        if (answer=="o") {
            binding.tv12Title.text = "정답입니다 !"
            binding.tv12Title.setTextColor(getColor(R.color.b2))
        } else {
            binding.tv12Title.text = "오답입니다."
            binding.tv12Title.setTextColor(getColor(R.color.rd))
        }
        binding.tv12Coin.text = coin.toString()


        binding.tv12Next.setOnClickListener {
            binding.iv12A.setOnClickListener{
                val i = Intent(this, ActivityQuiz13Binding::class.java)
                i.putExtra("answer","x")
                i.putExtra("coin", coin)
                i.putExtra("total_coin", total_coin)
                startActivity(i)
            }
        }
    }
}
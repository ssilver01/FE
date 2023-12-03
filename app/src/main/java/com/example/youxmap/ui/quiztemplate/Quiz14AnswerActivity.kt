package com.example.youxmap.ui.quiztemplate

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.youxmap.R
import com.example.youxmap.databinding.ActivityQuiz14AnswerBinding
import com.example.youxmap.databinding.ActivityQuiz12Binding
import com.example.youxmap.databinding.ActivityQuiz15Binding

class Quiz14AnswerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuiz14AnswerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuiz14AnswerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val answer = intent.getStringExtra("answer")
        val coin = intent.getIntExtra("coin", -1)
        val total_coin = intent.getIntExtra("total_coin", -1)

        if (answer=="o") {
            binding.tv14Title.text = "정답입니다 !"
            binding.tv14Title.setTextColor(getColor(R.color.b2))
        } else {
            binding.tv14Title.text = "오답입니다."
            binding.tv14Title.setTextColor(getColor(R.color.rd))
        }
        binding.tv14Coin.text = coin.toString()


        binding.tv14Next.setOnClickListener {
            binding.iv14A.setOnClickListener{
                val i = Intent(this, ActivityQuiz15Binding::class.java)
                i.putExtra("answer","x")
                i.putExtra("coin", coin)
                i.putExtra("total_coin", total_coin)
                startActivity(i)
            }
        }
    }
}
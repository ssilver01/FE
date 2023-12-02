package com.example.youxmap.ui.quiztemplate

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.youxmap.R
import com.example.youxmap.databinding.ActivityQuiz41AnswerBinding
import com.example.youxmap.databinding.ActivityQuiz12Binding
import com.example.youxmap.databinding.ActivityQuiz42Binding

class Quiz41AnswerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuiz41AnswerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuiz41AnswerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val answer = intent.getStringExtra("answer")
        val coin = intent.getIntExtra("coin", -1)
        val total_coin = intent.getIntExtra("total_coin", -1)

        if (answer=="o") {
            binding.tv41Title.text = "정답입니다 !"
            binding.tv41Title.setTextColor(getColor(R.color.b2))
        } else {
            binding.tv41Title.text = "오답입니다."
            binding.tv41Title.setTextColor(getColor(R.color.rd))
        }
        binding.tv41Coin.text = coin.toString()


        binding.tv41Next.setOnClickListener {
            binding.iv41A.setOnClickListener{
                val i = Intent(this, ActivityQuiz42Binding::class.java)
                i.putExtra("answer","x")
                i.putExtra("coin", coin)
                i.putExtra("total_coin", total_coin)
                startActivity(i)
            }
        }
    }
}
package com.example.youxmap.ui.quiztemplate

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.youxmap.R
import com.example.youxmap.databinding.ActivityQuiz45AnswerBinding
import com.example.youxmap.databinding.ActivityQuiz12Binding

class Quiz45AnswerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuiz45AnswerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuiz45AnswerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val answer = intent.getStringExtra("answer")
        val coin = intent.getIntExtra("coin", -1)
        val total_coin = intent.getIntExtra("total_coin", -1)

        if (answer=="o") {
            binding.tv45Title.text = "정답입니다 !"
            binding.tv45Title.setTextColor(getColor(R.color.b2))
        } else {
            binding.tv45Title.text = "오답입니다."
            binding.tv45Title.setTextColor(getColor(R.color.rd))
        }
        binding.tv45Coin.text = coin.toString()


        binding.tv45Next.setOnClickListener {
            binding.iv45A.setOnClickListener{
//                val i = Intent(this, ActivityQuiz45AnswerBinding::class.java)
//                i.putExtra("answer","x")
//                i.putExtra("coin", coin)
//                i.putExtra("total_coin", total_coin)
//                startActivity(i)
            }
        }
    }
}
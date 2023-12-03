package com.example.youxmap.ui.quiztemplate

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.youxmap.R
import com.example.youxmap.databinding.ActivityQuiz13AnswerBinding
import com.example.youxmap.databinding.ActivityQuiz12Binding
import com.example.youxmap.databinding.ActivityQuiz14Binding

class Quiz13AnswerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuiz13AnswerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuiz13AnswerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val answer = intent.getStringExtra("answer")
        val coin = intent.getIntExtra("coin", -1)
        val total_coin = intent.getIntExtra("total_coin", -1)

        if (answer=="o") {
            binding.tv13Title.text = "정답입니다 !"
            binding.tv13Title.setTextColor(getColor(R.color.b2))
        } else {
            binding.tv13Title.text = "오답입니다."
            binding.tv13Title.setTextColor(getColor(R.color.rd))
        }
        binding.tv13Coin.text = coin.toString()


        binding.tv13Next.setOnClickListener {
            binding.iv13A.setOnClickListener{
                val i = Intent(this, ActivityQuiz14Binding::class.java)
                i.putExtra("answer","x")
                i.putExtra("coin", coin)
                i.putExtra("total_coin", total_coin)
                startActivity(i)
            }
        }
    }
}
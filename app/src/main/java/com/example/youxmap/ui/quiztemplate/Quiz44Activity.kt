package com.example.youxmap.ui.quiztemplate

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.youxmap.databinding.ActivityQuiz11Binding
import com.example.youxmap.databinding.ActivityQuiz44AnswerBinding
import com.example.youxmap.databinding.ActivityQuiz44Binding

class Quiz44Activity : AppCompatActivity() {
    private lateinit var binding: ActivityQuiz44Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuiz44Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val coin = intent.getIntExtra("coin", -1)
        val total_coin = intent.getIntExtra("total_coin", -1)

        binding.iv44A.setOnClickListener{
            val i = Intent(this, ActivityQuiz44AnswerBinding::class.java)
            i.putExtra("answer","x")
            i.putExtra("coin", coin)
            i.putExtra("total_coin", total_coin)
            startActivity(i)
        }

        binding.iv44B.setOnClickListener {
            val i = Intent(this, ActivityQuiz44AnswerBinding::class.java)
            i.putExtra("answer","o")
            val coinList = getPoint(coin, total_coin)
            i.putExtra("coin", coinList[0])
            i.putExtra("total_coin", coinList[1])
            startActivity(i)
        }
    }

    private fun getPoint(coin: Int, totalCoin: Int): IntArray {
        val updateCoin = coin + 5
        val updateTotalCoin = totalCoin + 5

        return intArrayOf(updateCoin, updateTotalCoin)
    }


}
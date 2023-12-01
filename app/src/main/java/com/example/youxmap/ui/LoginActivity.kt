package com.example.youxmap.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.youxmap.databinding.ActivityLoginBinding
import com.example.youxmap.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvLoginSignup.setOnClickListener {
            //회원가입 api
        }

        binding.tvLoginLogin.setOnClickListener {
            //로그인 api
        }
    }
}
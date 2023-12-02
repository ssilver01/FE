package com.example.youxmap.ui.quiz

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.youxmap.databinding.ActivityQuiz41Binding
import com.example.youxmap.databinding.FragmentLevelBinding
import com.example.youxmap.ui.quiztemplate.Quiz11Activity

class LevelFragment : Fragment() {
    private var _binding: FragmentLevelBinding? = null
    private var isOpen2 = false
    private var isOpen3 = false
    private var isOpen4 = false
    private var isOpen5 = false
    private var coin = 0
    private var total_coin = 0
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLevelBinding.inflate(inflater, container, false)
        val root: View = binding.root

        //coin 받아오기

        binding.tvLevel1Btn.setOnClickListener {
            val i = Intent(requireContext(), Quiz11Activity::class.java)
            i.putExtra("coin", coin)
            i.putExtra("total_coin", total_coin)
            startActivity(i)
        }

        binding.tvLevel4Btn.setOnClickListener {
            if (!isOpen4) {
                binding.cvLevelLock4.visibility = View.GONE
                binding.tvLevel4Btn1.visibility = View.GONE
                binding.tvLevel4Btn2.visibility = View.VISIBLE
                isOpen4 = true
            } else {
                val i = Intent(requireContext(), ActivityQuiz41Binding::class.java)
                i.putExtra("coin", coin)
                i.putExtra("total_coin", total_coin)
                startActivity(i)
            }
        }


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
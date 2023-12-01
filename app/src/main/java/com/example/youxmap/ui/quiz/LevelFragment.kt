package com.example.youxmap.ui.quiz

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.youxmap.databinding.FragmentLevelBinding

class LevelFragment : Fragment() {
    private var _binding: FragmentLevelBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLevelBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.tvLevel1Btn.setOnClickListener {
            val i = Intent(requireContext(), QuizTemplateActivity::class.java)
            startActivity(i)
        }


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
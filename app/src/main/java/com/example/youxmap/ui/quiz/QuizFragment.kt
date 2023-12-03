package com.example.youxmap.ui.quiz

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.youxmap.R
import com.example.youxmap.databinding.FragmentQuizBinding

class QuizFragment : Fragment() {

    private var _binding: FragmentQuizBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val quizViewModel =
            ViewModelProvider(this).get(QuizViewModel::class.java)

        _binding = FragmentQuizBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textDashboard
//        quizViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }

        binding.tvQuizBtn.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(R.id.tv_quiz_btn, LevelFragment()).commitAllowingStateLoss()
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
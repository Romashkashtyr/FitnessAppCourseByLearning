package com.example.fitnessappcourse.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fitnessappcourse.R
import com.example.fitnessappcourse.adapters.DayModel
import com.example.fitnessappcourse.databinding.FragmentDaysBinding

class DaysFragment : Fragment() {
    private lateinit var binding: FragmentDaysBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDaysBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    private fun fillDaysArray(): ArrayList<DayModel> {
        val tArray = ArrayList<DayModel>()
        resources.getStringArray(R.array.day_exercises).forEach {
            tArray.add(DayModel(it, false))
        }
        return tArray
    }
    companion object {

        @JvmStatic
        fun newInstance() = DaysFragment()
    }
}
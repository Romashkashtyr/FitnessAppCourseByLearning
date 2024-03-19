package com.example.fitnessappcourse.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.fitnessappcourse.R
import com.example.fitnessappcourse.databinding.DaysListItemBinding

class DaysAdapter: ListAdapter<DayModel, DaysAdapter.DayHolder>() {


    inner class DayHolder(view: View): RecyclerView.ViewHolder(view){

        private val binding =  DaysListItemBinding.bind(view.rootView)

        fun setData(day: DayModel) = with(binding){

            val name = binding.root.context.getString(R.string.day) + " ${adapterPosition + 1}"
            tvName.text = name
            val exCounter = day.exercises.split(",").toString()
            tvExCounter.text = exCounter
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DayHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: DayHolder, position: Int) {
        TODO("Not yet implemented")
    }
}
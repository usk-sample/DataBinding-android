package com.example.databindingsample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.databindingsample.databinding.UserRowBinding

class UserViewHolder(binding: UserRowBinding) : RecyclerView.ViewHolder(binding.root)

class UserAdapter(private val items: List<User>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: UserRowBinding = DataBindingUtil.inflate(inflater, R.layout.user_row, parent, false)
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        
    }

    override fun getItemCount(): Int {
        return items.count()
    }
}
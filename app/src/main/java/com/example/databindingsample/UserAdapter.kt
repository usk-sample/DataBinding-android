package com.example.databindingsample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.databindingsample.databinding.UserRowBinding

class UserViewHolder(var binding: UserRowBinding) : RecyclerView.ViewHolder(binding.root)

class UserAdapter(private val items: List<User>) : RecyclerView.Adapter<UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: UserRowBinding = DataBindingUtil.inflate(inflater, R.layout.user_row, parent, false)
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.binding.user = items[position]
    }

    override fun getItemCount(): Int {
        return items.count()
    }
}
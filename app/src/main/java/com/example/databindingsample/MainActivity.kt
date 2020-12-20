package com.example.databindingsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.databindingsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: UserAdapter
    private var users: MutableList<User> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        users.add(User("aaaaaaa"))
        users.add(User("bbbbbbb"))
        users.add(User("ccccccc"))
        users.add(User("ddddddd"))
        users.add(User("eeeeeee"))

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //set LinearLayoutManager (default: VERTICAL)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        //set divider
        val dividerItemDecoration = DividerItemDecoration(this, RecyclerView.VERTICAL)
        dividerItemDecoration.setDrawable(ContextCompat.getDrawable(this, R.drawable.separator)!!)

        //set adapter
        adapter = UserAdapter(users)
        binding.recyclerView.adapter = adapter

    }
}
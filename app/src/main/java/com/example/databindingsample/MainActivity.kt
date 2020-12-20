package com.example.databindingsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var users: MutableList<User> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        users.add(User("aaaaaaa"))
        users.add(User("bbbbbbb"))
        users.add(User("ccccccc"))
        users.add(User("ddddddd"))
        users.add(User("eeeeeee"))

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }
}
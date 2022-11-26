package com.example.home_work_kotlin_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.home_work_kotlin_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().add(R.id.container_two, PlaylistFragment()).commit()
            supportFragmentManager.beginTransaction().add(R.id.container, MainFragment()).commit()
        }
    }
}
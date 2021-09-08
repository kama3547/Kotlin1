package com.example.kotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log
import android.widget.TextView
import com.example.kotlin1.MainActivity.Companion.GET_TEXT
import com.example.kotlin1.databinding.ActivitySecondBinding

class ActivitySecond : AppCompatActivity() {
    private lateinit var binding : ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent = intent
        binding.txtT.text = intent.getStringExtra(GET_TEXT).toString()
        }
    }

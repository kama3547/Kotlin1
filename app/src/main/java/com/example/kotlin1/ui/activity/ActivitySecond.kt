package com.example.kotlin1.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kotlin1.ui.activity.MainActivity.Companion.GET_TEXT
import com.example.kotlin1.databinding.ActivitySecondBinding

class ActivitySecond : AppCompatActivity() {

    lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtT.text = intent.getStringExtra(GET_TEXT).toString()
        binding.btn2.setOnClickListener {
            if (binding.txtT.text.trim().toString().isEmpty()
            ) {
            } else {
                startActivity(
                    Intent(this, MainActivity::class.java).putExtra(
                        GET_TEXT,
                        binding.txtT.text.toString()
                    )
                )
            }
        }
        }
    }

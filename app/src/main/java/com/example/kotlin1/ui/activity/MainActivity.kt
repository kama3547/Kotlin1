package com.example.kotlin1.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kotlin1.databinding.ActivityMainBinding
import com.example.kotlin1.databinding.ActivitySecondBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txt2.text = intent.getStringExtra(GET_TEXT) ?: ""
        binding.btnB.setOnClickListener {
            if (binding.editTxt.text.trim().toString().isEmpty()
            ) {
                Toast.makeText(this, "EditText не может быть пустым", Toast.LENGTH_SHORT).show()
            } else {
                startActivity(
                    Intent(this, ActivitySecond::class.java).putExtra(
                        GET_TEXT,
                        binding.editTxt.text.toString()
                    )
                )
            }
        }

    }

    companion object {
        const val GET_TEXT = "data"
    }
}
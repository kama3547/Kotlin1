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
            if (binding.editTxt2.text.trim().toString().isEmpty()
            ) {
                Toast.makeText(this, "EditText не может быть пустым", Toast.LENGTH_SHORT).show()
            } else {
                startActivity(
                    Intent(this, MainActivity::class.java)
                        .putExtra(GET_TEXT2, binding.editTxt2.text.toString())
                )
            }
        }
    }

    companion object {
        const val GET_TEXT2 = "data2"
    }
}

package com.example.pert2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pert2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            test1.setOnClickListener {
                Toast.makeText(this@MainActivity, "Hello" + coba.text, Toast.LENGTH_LONG).show()
            }
        }
    }
}
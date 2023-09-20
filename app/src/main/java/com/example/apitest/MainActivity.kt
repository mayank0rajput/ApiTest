package com.example.apitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import com.example.apitest.databinding.ActivityMainBinding
import java.io.DataOutput

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var testButton: Button
    private lateinit var input: EditText
    private lateinit var output: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        // UI elements linking
        testButton = binding.button
        input = binding.editText
        output = binding.textView

        testButton.setOnClickListener {
            val inputText = input.text.toString() // text from xml
            val outputText = "You entered $inputText"
            output.text = outputText // to show
        }
    }
}
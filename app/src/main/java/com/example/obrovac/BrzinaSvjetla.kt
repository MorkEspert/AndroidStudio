package com.example.obrovac

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.obrovac.databinding.Activity2Binding


class BrzinaSvjetla : AppCompatActivity() {
    lateinit var binding: Activity2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonBrzina.setOnClickListener {
            val frekvencija = binding.frekvencija.text.toString().toDoubleOrNull() ?: 0.0
            val valnaDuljina = binding.valnaDuljina.text.toString().toDoubleOrNull() ?: 0.0

            val rezultat = frekvencija * valnaDuljina

            binding.brzinaSvjetla.text = "$rezultat"

        }
        binding.buttonNazad.setOnClickListener{
            finish()
        }
    }
}
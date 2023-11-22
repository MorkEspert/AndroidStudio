package com.example.obrovac

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.obrovac.databinding.Activity1Binding


class ElektrostatskaPotencijalnaEnergija : AppCompatActivity() {
    lateinit var binding: Activity1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonElektrostatska.setOnClickListener {
            val naboj = binding.naboj.text.toString().toDoubleOrNull() ?: 0.0
            val potencijalnaEnergija = binding.potencijalnaRazlika.text.toString().toDoubleOrNull() ?: 0.0

            val rezultat = naboj * potencijalnaEnergija

            binding.elektrostatskaPotencijalnaEnergija.text = "$rezultat"

        }
        binding.buttonNazad.setOnClickListener{
            finish()
        }
    }
}

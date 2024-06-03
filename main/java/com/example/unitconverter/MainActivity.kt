package com.example.unitconverter

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.unitconverter.ui.theme.UnitConverterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edt : EditText = findViewById(R.id.kilo_edt)
        val btn : Button = findViewById(R.id.btn)
        val resultText : TextView = findViewById(R.id.result_text)

        btn.setOnClickListener(){
            val kilos: Double = edt.text.toString().toDouble()
            resultText.setText("" + convertToPounds(kilos))
        }
    }
    fun convertToPounds(kilos: Double):Double {
        var pounds = kilos * 2.20462
        return pounds
    }
}
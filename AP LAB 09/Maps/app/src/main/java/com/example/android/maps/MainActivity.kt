package com.example.android.maps

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun convertToBmi(v:View)
    {

        var Weight:EditText= findViewById<EditText>(R.id.editText3)
        var Height:EditText= findViewById<EditText>(R.id.editText5)

        var BMI:Double =( Weight.text.toString().toDouble()/Height.text.toString().toDouble() ) / Height.text.toString().toDouble()


        var textView:TextView = findViewById<TextView>(R.id.textView2)

        textView.setText(BMI.toString())
    }
}

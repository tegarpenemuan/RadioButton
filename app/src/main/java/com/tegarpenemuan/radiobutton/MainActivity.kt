package com.tegarpenemuan.radiobutton

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    var rg1: RadioGroup? = null
    var rb1: RadioButton? = null
    var b1: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addListenerRadioButton()
    }

    private fun addListenerRadioButton() {
        rg1 = findViewById<View>(R.id.radioGroup) as RadioGroup
        b1 = findViewById<View>(R.id.button2) as Button
        b1!!.setOnClickListener {
            val selected = rg1!!.checkedRadioButtonId
            rb1 = findViewById<View>(selected) as RadioButton
            Toast.makeText(this@MainActivity, rb1!!.text, Toast.LENGTH_LONG).show()
        }
    }
}
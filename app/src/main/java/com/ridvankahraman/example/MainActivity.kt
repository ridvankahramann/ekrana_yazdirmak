package com.ridvankahraman.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnSave = findViewById<Button>(R.id.btnSave)
        var name = findViewById<TextView>(R.id.name)
        var last_name = findViewById<TextView>(R.id.last_name)
        var text_view = findViewById<TextView>(R.id.text_view)
        btnSave.setOnClickListener {
            if (name.text.toString() != "" && last_name.text.toString() != ""){
                text_view.setText(name.text.toString() + " " + last_name.text.toString())
            }else{
                Toast.makeText(this, "Do not leave blank", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
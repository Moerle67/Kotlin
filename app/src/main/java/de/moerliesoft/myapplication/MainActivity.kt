package de.moerliesoft.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.btn1)

        var counter = 0
        textView.setText("MoerliSoft-Counter")
        button.setOnClickListener{
            counter++
            textView.setText("Der Button wurde $counter mal gedrückt.")

            btn1
        }
    }
}
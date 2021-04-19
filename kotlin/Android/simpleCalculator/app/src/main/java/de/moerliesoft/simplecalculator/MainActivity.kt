package de.moerliesoft.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.ArithmeticException

class MainActivity : AppCompatActivity() {
    var point = false
    var first_zero = true
    var on_operator = false
    var last_numeric = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onDigit(view: View) {
        if (first_zero) {
            tvDisplay.setText((view as Button).text)
            first_zero = false
        }
        else {
            tvDisplay.append((view as Button).text)
        }
        last_numeric = true
    }

    fun onClear(view: View) {
        tvDisplay.text = "0"
        point = false
        first_zero = true
        on_operator = false
        last_numeric = true
    }

    fun onPoint(view: View) {
        if (!point) {
            tvDisplay.append(".")
            point = true
        }
    }

    fun onOperator(view: View) {
        if (!on_operator) {
            tvDisplay.append((view as Button).text)
            on_operator = true
            last_numeric = false
            point = false
        }
    }

    fun onEqual(view: View) {
        if (last_numeric) {
            var tvValue = tvDisplay.text.toString()
            var ergebnis = 0
            try {
                if (tvValue.contains("-")) {
                    print("Minus")
                    val splitValues = tvValue.split("-")
                    ergebnis = splitValues[0].toInt()-splitValues[1].toInt()
                }
                else if (tvValue.contains("*")) {
                    print("Minus")
                    val splitValues = tvValue.split("*")
                    ergebnis = splitValues[0].toInt()*splitValues[1].toInt()
                }
                else if (tvValue.contains("/")) {
                    print("Minus")
                    val splitValues = tvValue.split("/")
                    ergebnis = splitValues[0].toInt()/splitValues[1].toInt()
                }
                else if (tvValue.contains("+")) {
                    print("Minus")
                    val splitValues = tvValue.split("+")
                    ergebnis = splitValues[0].toInt()+splitValues[1].toInt()
                }
                tvDisplay.setText(ergebnis.toString())
                point = false
                on_operator = false
                last_numeric = true
            } catch (e: ArithmeticException) {
                e.printStackTrace()
            }
        }
    }
}
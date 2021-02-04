package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var textView: TextView? = null
    var button: Button? = null

    var score: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        button = findViewById(R.id.countButton)
    }

    fun count(view: View) {
        score = textView!!.text.toString().toInt()
        score++
        var answer: String = stringFormat(score)
        textView!!.text = answer
    }

    private fun stringFormat(number: Int): String {
        var length: Int = number.toString().length
        var remain: Int = 4 - length
        var answer: String = ""
        for (i in 1..remain) {
            answer += "0"
        }
        answer += number.toString()
        return answer
    }
}
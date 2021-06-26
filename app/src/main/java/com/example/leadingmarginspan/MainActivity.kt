package com.example.leadingmarginspan

import android.os.Bundle
import android.text.SpannableStringBuilder
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)

        val list = mutableListOf(
            "Log in Google account\n",
            "Scroll to the page\n",
            "Tap disconnect from account to logout"
        )
        var number = 1
        val builder = SpannableStringBuilder()
        for (text in list) {
            val contentStart: Int = builder.length
            builder.append(text)
            builder.setSpan(NumberIndentSpan(15, 15, number), contentStart, builder.length, 0)
            number++
        }
        textView.text = builder
    }
}
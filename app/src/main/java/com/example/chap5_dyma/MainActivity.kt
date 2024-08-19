package com.example.chap5_dyma

import android.graphics.Typeface
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.StyleSpan
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var text: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        text = findViewById(R.id.text)

        val spannable = SpannableString("Bold and Italic Text")

        spannable.setSpan(StyleSpan(Typeface.BOLD), 0, 4, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        spannable.setSpan(StyleSpan(Typeface.ITALIC), 9, 15, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        text.text = spannable



    }
}
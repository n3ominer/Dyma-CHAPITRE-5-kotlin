package com.example.chap5_dyma

import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    lateinit var progressBar: ProgressBar
    lateinit var seekBar: SeekBar
    lateinit var seekBarValue: TextView

    lateinit var cardView: CardView

    lateinit var linearLayout1: LinearLayout
    lateinit var linearLayout2: LinearLayout
    lateinit var linearLayout3: LinearLayout
    lateinit var linearLayout4: LinearLayout


    lateinit var textView1: TextView
    lateinit var textView2: TextView
    lateinit var textView3: TextView
    lateinit var textView4: TextView

    lateinit var btn1: ImageButton
    lateinit var btn2: ImageButton
    lateinit var btn3: ImageButton
    lateinit var btn4: ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        this.progressBarsSetup()
        this.cardViewSetUp()
        this.setUpVisibilityLayout()
    }

    private fun setUpVisibilityLayout() {

        // Le code ci-dessous ne fonctionnera que si vous avez ajotué le include dans le XML
        // Sinon, une NullPointerException sera levée à la ligne 56
        /*this.setUpViews()
        btn1.setOnClickListener {
            if (textView1.visibility == View.VISIBLE) {
                textView1.visibility = View.INVISIBLE
            } else {
                textView1.visibility = View.VISIBLE
            }
        }
        btn3.setOnClickListener {
            if (textView3.visibility == View.VISIBLE) {
                textView3.visibility = View.GONE
            } else {
                textView3.visibility = View.VISIBLE
            }
        }

        btn2.setOnClickListener {
            if (linearLayout2.visibility == View.VISIBLE) {
                linearLayout2.visibility = View.GONE
            }
        }
        btn4.setOnClickListener {
            if (linearLayout2.visibility == View.GONE) {
                linearLayout2.visibility = View.VISIBLE
            }

            if (textView4.visibility == View.VISIBLE) {
                textView4.visibility = View.INVISIBLE
            } else {
                textView4.visibility = View.VISIBLE
            }

        }*/
    }

    private fun setUpViews() {
        this.linearLayout1 = findViewById(R.id.ll_1)
        this.linearLayout2 = findViewById(R.id.ll_2)
        this.linearLayout3 = findViewById(R.id.ll_3)
        this.linearLayout4 = findViewById(R.id.ll_4)

        this.textView1 = findViewById(R.id.text_1_tv)
        this.textView2 = findViewById(R.id.text_2_tv)
        this.textView3 = findViewById(R.id.text_3_tv)
        this.textView4 = findViewById(R.id.text_4_tv)

        this.btn1 = findViewById(R.id.btn_1)
        this.btn2 = findViewById(R.id.btn_2)
        this.btn3 = findViewById(R.id.btn_3)
        this.btn4 = findViewById(R.id.btn_4)
    }

    private fun cardViewSetUp() {
        // Le code ci-dessous ne fonctionnera que si vous avez ajotué le include dans le XML
        // Sinon, une NullPointerException sera levée à la ligne 30

        /*
            this.cardView = findViewById(R.id.center_cardview)
            this.cardView.setOnClickListener {
                Toast.makeText(this, "Card view clicked !", Toast.LENGTH_LONG).show()
            }
        */
    }

    private fun progressBarsSetup() {
        // Le code ci-dessous ne fonctionnera que si vous avez ajotué le include dans le XML
        // Sinon, une NullPointerException sera levée à la ligne 30

        /*
            progressBar = findViewById(R.id.progress_bar)
            seekBar = findViewById(R.id.seek_bar)
            seekBarValue = findViewById(R.id.seek_bar_value_tv)

            progressBar.progress = 1

            ObjectAnimator.ofInt(progressBar, "progress", 1, 100)
                .setDuration(50000)
                .start()

            seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                    this@MainActivity.seekBarValue.text = p1.toString()
                }

                override fun onStartTrackingTouch(p0: SeekBar?) {
                }

                override fun onStopTrackingTouch(p0: SeekBar?) {
                }
            })
         */
    }

}
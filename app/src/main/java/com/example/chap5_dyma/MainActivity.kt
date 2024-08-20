package com.example.chap5_dyma

import android.animation.ObjectAnimator
import android.os.Bundle
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

    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        this.progressBarsSetup()
        this.cardViewSetUp()
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
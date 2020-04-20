package com.example.myworker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_blur.*


class BlurActivity : AppCompatActivity() {
    private lateinit var blurViewModel: BlurViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blur)

        blurViewModel = ViewModelProvider(this).get(BlurViewModel::class.java)
    }

    fun goButtonClick(view: View) {
        blurViewModel.applyBlur(blurLevel)
        /*Toast.makeText(this, "$blurLevel", Toast.LENGTH_SHORT).show()*/
    }

    fun sButtonClick(view: View) {}



    private val blurLevel: Int
        get() =
            when (radio_blur_group.checkedRadioButtonId) {
                R.id.radio_blur_lv_1 -> 1
                R.id.radio_blur_lv_2 -> 2
                R.id.radio_blur_lv_3 -> 3
                else -> 1
            }

}

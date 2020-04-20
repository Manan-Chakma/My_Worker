package com.example.myworker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun selectImageButtonClick(view: View) {
/*        Toast.makeText(applicationContext, "Select Image Button Clicked", Toast.LENGTH_SHORT).show()*/
        val intent = Intent(this, BlurActivity::class.java)
        startActivity(intent)
    }
}

package com.none.morningmotivation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button2.setOnClickListener {
            val n=name.text.toString()
            val intent= Intent(this,SecondActivity::class.java)
            intent.putExtra("user_name",n)
            startActivity(intent);
        }
    }
}
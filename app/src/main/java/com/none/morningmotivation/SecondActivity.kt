package com.none.morningmotivation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val bundle: Bundle?=intent.extras
        val name=bundle!!.getString("user_name")
        greeting.text="Good Morning ${name}"
        val x=1..3
        val res=x.random()
        val message2:String
        when(res)
        {
            1-> message2="You have two choices continue to sleep with your dreams or wakeup and chase them"
            2->message2="Start where you are, Use what you have and Do what you can"
            3->message2="Yesterday is gone, Tomorrow is mystery and Today is blessing"
            else->message2="Write in your heart that every day is teh best day of the year"
        }
        message.text=message2
    }
}
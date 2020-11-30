package com.example.kotlinstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.view, OneFragment())
                .commit()
        }

        btn2.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.view, TwoFragment())
                .commit()

        }

        btn3.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.view, ThreeFragment())
                .commit()
        }
    }
}
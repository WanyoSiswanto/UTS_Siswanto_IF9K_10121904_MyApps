package com.siswanto.myappsiswanto

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val icon1: ImageButton = findViewById(R.id.icon1)
        val icon2: ImageButton = findViewById(R.id.icon2)
        val icon3: ImageButton = findViewById(R.id.icon3)
        val icon4: ImageButton = findViewById(R.id.icon4)

        icon1.setOnClickListener {
            val intent = Intent(this, DailyActivity::class.java)
            startActivity(intent)
        }

//        icon2.setOnClickListener {
//            val intent = Intent(this, Activity2::class.java)
//            startActivity(intent)
//        }
//
//        icon3.setOnClickListener {
//            val intent = Intent(this, Activity3::class.java)
//            startActivity(intent)
//        }
//
//        icon4.setOnClickListener {
//            val intent = Intent(this, Activity4::class.java)
//            startActivity(intent)
//        }
    }
}


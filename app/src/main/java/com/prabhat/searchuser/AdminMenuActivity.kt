package com.prabhat.searchuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class AdminMenuActivity : AppCompatActivity() {
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_menu)
        val btn = findViewById<Button>(R.id.btn)
        val id1 = findViewById<View>(R.id.id1)
        val id2 = findViewById<View>(R.id.id2)

        btn.setOnClickListener {
            count += 1
            if((count%2) != 0) {
                //id2.visibility = View.INVISIBLE
                id1.visibility = View.VISIBLE
            }
            else if((count%2) == 0) {
                //id1.visibility = View.INVISIBLE
                id2.visibility = View.VISIBLE
                count = 0
            }
        }

        var back = findViewById<Button>(R.id.back)
        back.setOnClickListener {
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
    }
}
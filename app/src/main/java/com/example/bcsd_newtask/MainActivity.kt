package com.example.bcsd_newtask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickBtnPage2()

        val list = (1..100).toList()

        val listView = findViewById<ListView>(R.id.list_view)
        val adapter = ArrayAdapter<Int>(
            this,
            android.R.layout.simple_list_item_1,
            list
        )

        listView.adapter = adapter
    }

    private fun clickBtnPage2(){
        val intent = Intent(this, SecondActivity::class.java)
        val buttonPage2 = findViewById<Button>(R.id.page2_button)

        buttonPage2.setOnClickListener {
            startActivity(intent)
            finish()
        }
    }
}
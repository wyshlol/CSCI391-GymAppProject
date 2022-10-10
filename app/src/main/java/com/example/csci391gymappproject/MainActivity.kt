package com.example.csci391gymappproject

import android.os.Bundle
import android.text.InputType
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.csci391gymappproject.adapter.ItemAdapter
import com.example.csci391gymappproject.data.Datasource

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Buttons
        val pullButton: Button = findViewById(R.id.pullButton)
        val pushButton: Button = findViewById(R.id.pushButton)
        val legsButton: Button = findViewById(R.id.legsButton)
        pullButton.setOnClickListener {
            // Initialize data.
            val pullDay = Datasource().loadWorkoutPull()

            val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
            recyclerView.adapter = ItemAdapter(this, pullDay)

            // Use this setting to improve performance if you know that changes
            // in content do not change the layout size of the RecyclerView
            recyclerView.setHasFixedSize(true)
        }

        pushButton.setOnClickListener {
            // Initialize data.
            val pushDay = Datasource().loadWorkoutPush()

            val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
            recyclerView.adapter = ItemAdapter(this, pushDay)

            // Use this setting to improve performance if you know that changes
            // in content do not change the layout size of the RecyclerView
            recyclerView.setHasFixedSize(true)
        }

        legsButton.setOnClickListener {
            // Initialize data.
            val legsDay = Datasource().loadWorkoutLegs()

            val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
            recyclerView.adapter = ItemAdapter(this, legsDay)

            // Use this setting to improve performance if you know that changes
            // in content do not change the layout size of the RecyclerView
            recyclerView.setHasFixedSize(true)
        }




    }
}
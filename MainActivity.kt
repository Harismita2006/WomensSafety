package com.example.smartshoe

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.*
import com.example.smartshoe.utils.AlertUtils

class MainActivity : AppCompatActivity() {

    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listenForAlerts()
    }

    private fun listenForAlerts() {
        database = FirebaseDatabase.getInstance().getReference("alerts")

        database.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                snapshot.children.forEach {
                    val message = it.child("message").value.toString()
                    val location = it.child("location").value.toString()

                    AlertUtils.showEmergencyDialog(this@MainActivity, message, location)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle error here if needed
            }
        })
    }
}

package com.example.patryk.lecturepermissionsender

import android.Manifest
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button_system).setOnClickListener {
            val intent = Intent("com.example.PAM_SYSTEM")
            sendBroadcast(intent, Manifest.permission.SEND_SMS)
        }

        findViewById<Button>(R.id.button_custom).setOnClickListener {
            val intent = Intent("com.example.PAM_CUSTOM")
            sendBroadcast(intent, "com.example.PAM_CUSTOM")
        }


    }
}

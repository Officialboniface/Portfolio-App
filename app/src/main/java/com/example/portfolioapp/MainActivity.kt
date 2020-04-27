package com.example.portfolioapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.View
import android.view.textclassifier.ConversationActions
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       Email.setOnClickListener(){
            val message: String = Third_tv.text.toString()
           val intent = Intent()
           intent.action = Intent.ACTION_SEND
           intent.putExtra(Intent.EXTRA_TEXT, message)
           intent.type = "text/plain"
           startActivity(Intent.createChooser(intent, "Share to:"))

       }

        facebook.setOnClickListener(){
            val message: String = Third_tv.text.toString()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Share to:"))

        }

        Instagram.setOnClickListener(){
            val message: String = Third_tv.text.toString()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Share to:"))

        }

        Twitter.setOnClickListener(){
            val message: String = Third_tv.text.toString()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Share to:"))

        }

        LinkedIn.setOnClickListener(){
            val message: String = Third_tv.text.toString()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Share to:"))

        }


    }
}

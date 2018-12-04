package com.example.think.tp3

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnLogin.setOnClickListener {
            val intent=Intent()
            intent.putExtra("response",txtUname.text.toString() +"-"+txtPwd.text.toString())
            setResult(Activity.RESULT_OK,intent)
            finish()
        }
    }
}

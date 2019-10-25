package com.example.sahambluechips

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class personalInformation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val actionbar = supportActionBar
        actionbar!!.title = "Personal Information"
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
}

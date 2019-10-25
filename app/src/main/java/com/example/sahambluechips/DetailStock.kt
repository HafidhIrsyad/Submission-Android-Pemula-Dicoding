package com.example.sahambluechips

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailStock : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_stock)

        val itemNames: TextView = findViewById(R.id.namaStock)
        val imgSetPhoto: ImageView = findViewById(R.id.logoStock)
        val itemDetails: TextView = findViewById(R.id.description)

        val actionbar = supportActionBar
        actionbar!!.title = "Detail Stock"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val iName =  intent.getStringExtra(EXTRA_NAME)
        val iImg =  intent.getIntExtra(EXTRA_PHOTO,0)
        val iDesc =  intent.getStringExtra(EXTRA_DESC)

        itemNames.text = iName
        Glide.with(this)
            .load(iImg)
            .apply(RequestOptions())
            .into(imgSetPhoto)
        itemDetails.text = iDesc
    }

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_DESC = "extra_desc"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}

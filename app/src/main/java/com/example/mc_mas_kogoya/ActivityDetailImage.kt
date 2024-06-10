package com.example.mc_mas_kogoya

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ActivityDetailImage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_image)

        val image = intent.getParcelableExtra<ItemImage>(ActivityModul7.INTENT_PARCELABLE)
        val imgSrc = findViewById<ImageView>(R.id.imageDetail)
        val imgTitle = findViewById<TextView>(R.id.imageTitle)
        val imgDesc = findViewById<TextView>(R.id.imageDesc)

        imgSrc.setImageResource(image!!.imageSrc)
        imgTitle.text = image.imageTitle
        imgDesc.text = image.imageDesc
    }
}
package com.example.mc_mas_kogoya

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mc_mas_kogoya.databinding.ActivityModul8Binding

class ActivityModul8 : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    private  var gridLayoutManager: LinearLayoutManager? = null
    private lateinit var binding: ActivityModul8Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_modul8)

        binding = ActivityModul8Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageList: List<DataModel> = listOf(
            DataModel(
                R.drawable.logo1,
                "Noken samping",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
            ),
            DataModel(
                R.drawable.logo2,
                "Noken samping",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
            ),
            DataModel(
                R.drawable.logo3,
                "Kalung Yoa",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
            ),
            DataModel(
                R.drawable.logo4,
                "Gelang Tangan",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
            ),
            DataModel(
                R.drawable.logo5,
                "Gelang Tangan",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
            ),
            DataModel(
                R.drawable.logo6,
                "Gelang Tangan",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
            ),
            DataModel(
                R.drawable.logo7,
                "Gelang Tangan",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
            )
        )

        val  recyclerView = findViewById<RecyclerView>(R.id.imageGridLayout)
        gridLayoutManager = GridLayoutManager(applicationContext, 3, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)
        recyclerView.adapter =GridAdapter(this, imageList){
            val intent = Intent(this, ActivityDetailGrid::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

    }
}
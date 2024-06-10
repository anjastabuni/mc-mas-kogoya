package com.example.mc_mas_kogoya

import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.mc_mas_kogoya.databinding.ActivitySecondaryModul4Binding

class ActivitySecondaryModul4 : AppCompatActivity() {
    private lateinit var binding: ActivitySecondaryModul4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_secondary_modul4)

        binding = ActivitySecondaryModul4Binding.inflate(layoutInflater)
        setContentView(binding.root)


        val pesan = intent.getStringExtra(EXTRA_MESSAGE)
        binding.edtMessage.text = "Pesan : " + pesan
//        val textView: TextView = findViewById<TextView>(R.id.edtMessage).apply {
//            text = "pesan : "+ pesan
//        }

    }
}
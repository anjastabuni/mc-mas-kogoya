package com.example.mc_mas_kogoya

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.mc_mas_kogoya.databinding.ActivityFirsModul4Binding

class ActivityFirsModul4 : AppCompatActivity() {
    private lateinit var binding: ActivityFirsModul4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_firs_modul4)

        binding = ActivityFirsModul4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSend.setOnClickListener {
            val edtMessage = binding.edtMessage.text.toString()
            val intent = Intent(this, ActivitySecondaryModul4::class.java).apply {
                putExtra(EXTRA_MESSAGE, edtMessage)

            }
            startActivity(intent)
        }

    }
}
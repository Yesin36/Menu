package com.example.sharebundle

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sharebundle.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private  val binding : ActivityProfileBinding by lazy {
        ActivityProfileBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val intent = intent
        val name = intent.getStringExtra("name")
        val fathername = intent.getStringExtra("fathername")
        val roll = intent.getStringExtra("roll")
        val phone = intent.getStringExtra("phone")

        binding.showname.text = "Name: $name"
        binding.showfathername.text = "Father Name: $fathername:"
        binding.showroll.text = "Roll: $roll"
        binding.shownumber.text = "Phone: $phone"
    }
}
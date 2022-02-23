package com.binar.novelapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.binar.novelapp.databinding.ActivityAboutBinding
import com.bumptech.glide.Glide

class AboutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAboutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "About"
        Glide.with(this)
            .load(R.drawable.me)
            .circleCrop()
            .into(binding.ivMe)
    }
}
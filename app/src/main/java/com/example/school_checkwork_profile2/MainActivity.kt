package com.example.school_checkwork_profile2

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.school_checkwork_profile2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(this.root) }

        // ボタンを押したら
        binding.changeColorButton.setOnClickListener{

            //　テキストの色を変える
            binding.profileCommentText.setTextColor(Color.rgb(0, 180, 220))
        }
    }
}
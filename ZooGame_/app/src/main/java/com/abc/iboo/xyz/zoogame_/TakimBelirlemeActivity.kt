package com.abc.iboo.xyz.zoogame_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abc.iboo.xyz.zoogame_.databinding.ActivityTakimBelirlemeBinding

class TakimBelirlemeActivity : AppCompatActivity() {

    private lateinit var binding:ActivityTakimBelirlemeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTakimBelirlemeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewKirmiziT.setOnClickListener {
            val intent = Intent(this@TakimBelirlemeActivity,DeveActivity::class.java)
            startActivity(intent)
        }

       binding.imageViewMaviT.setOnClickListener {
            val intent = Intent(this@TakimBelirlemeActivity,MidilliMaviActivity::class.java)

            startActivity(intent)
        }

        binding.imageViewSariT.setOnClickListener {
            val intent = Intent(this@TakimBelirlemeActivity,DevekusuSariActivity::class.java)
            startActivity(intent)
        }

    }
}
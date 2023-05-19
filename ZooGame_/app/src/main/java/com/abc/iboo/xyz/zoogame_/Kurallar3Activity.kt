package com.abc.iboo.xyz.zoogame_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abc.iboo.xyz.zoogame_.databinding.ActivityKurallar2Binding
import com.abc.iboo.xyz.zoogame_.databinding.ActivityKurallar3Binding

class Kurallar3Activity : AppCompatActivity() {

    private lateinit var binding: ActivityKurallar3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKurallar3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewKuralar3Devam.setOnClickListener {
            val intent = Intent(this@Kurallar3Activity,Kurallar4Activity::class.java)
            startActivity(intent)
        }

    }
}
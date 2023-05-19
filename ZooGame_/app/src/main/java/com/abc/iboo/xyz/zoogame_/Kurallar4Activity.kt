package com.abc.iboo.xyz.zoogame_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abc.iboo.xyz.zoogame_.databinding.ActivityKurallar3Binding
import com.abc.iboo.xyz.zoogame_.databinding.ActivityKurallar4Binding

class Kurallar4Activity : AppCompatActivity() {

    private lateinit var binding: ActivityKurallar4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKurallar4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewKurallar4Devam.setOnClickListener {
            val intent = Intent(this@Kurallar4Activity,Kurallar5Activity::class.java)
            startActivity(intent)
        }

    }
}
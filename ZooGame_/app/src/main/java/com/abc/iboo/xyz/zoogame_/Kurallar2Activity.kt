package com.abc.iboo.xyz.zoogame_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abc.iboo.xyz.zoogame_.databinding.ActivityKurallar1Binding
import com.abc.iboo.xyz.zoogame_.databinding.ActivityKurallar2Binding

class Kurallar2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityKurallar2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKurallar2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewKurallar2Devam.setOnClickListener {
            val intent = Intent(this@Kurallar2Activity,Kurallar3Activity::class.java)
            startActivity(intent)
        }

    }
}
package com.abc.iboo.xyz.zoogame_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abc.iboo.xyz.zoogame_.databinding.ActivityKurallar1Binding

class Kurallar1Activity : AppCompatActivity() {

    private lateinit var binding:ActivityKurallar1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKurallar1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewKurallar1Devam.setOnClickListener {
            val intent = Intent(this@Kurallar1Activity,Kurallar2Activity::class.java)
            startActivity(intent)
        }

    }
}
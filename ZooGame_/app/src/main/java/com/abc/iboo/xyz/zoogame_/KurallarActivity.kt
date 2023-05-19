package com.abc.iboo.xyz.zoogame_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abc.iboo.xyz.zoogame_.databinding.ActivityKurallarBinding

class KurallarActivity : AppCompatActivity() {

    private lateinit var binding:ActivityKurallarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKurallarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewKurallarDevam.setOnClickListener {
                val intent = Intent(this@KurallarActivity,Kurallar1Activity::class.java)
                startActivity(intent)
        }

    }
}
package com.abc.iboo.xyz.zoogame_

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abc.iboo.xyz.zoogame_.databinding.ActivityKurallar5Binding

class Kurallar5Activity : AppCompatActivity() {

    private lateinit var binding:ActivityKurallar5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKurallar5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewKurallarDevam5.setOnClickListener {
            val intent = Intent(this@Kurallar5Activity,TakimBelirlemeActivity::class.java)
            startActivity(intent)
        }

    }
}
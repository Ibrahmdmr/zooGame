package com.abc.iboo.xyz.zoogame_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abc.iboo.xyz.zoogame_.databinding.ActivityNoRozetBlueBinding

class NoRozetBlueActivity : AppCompatActivity() {

    private lateinit var binding:ActivityNoRozetBlueBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNoRozetBlueBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonRozetKaybetmeM.setOnClickListener {
        val intent = Intent(this@NoRozetBlueActivity,UsakGirisActivity::class.java)
        startActivity(intent)
        }

    }
}
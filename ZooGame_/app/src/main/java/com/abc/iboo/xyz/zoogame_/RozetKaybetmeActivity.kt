package com.abc.iboo.xyz.zoogame_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abc.iboo.xyz.zoogame_.databinding.ActivityRozetKaybetmeBinding

class RozetKaybetmeActivity : AppCompatActivity() {

    private lateinit var binding:ActivityRozetKaybetmeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRozetKaybetmeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonRozetKaybetmeK.setOnClickListener {
            val intent = Intent(this@RozetKaybetmeActivity,UsakGirisActivity::class.java)
            startActivity(intent)
        }

    }
}
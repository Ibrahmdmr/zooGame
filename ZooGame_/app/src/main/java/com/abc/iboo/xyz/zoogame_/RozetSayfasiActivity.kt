package com.abc.iboo.xyz.zoogame_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abc.iboo.xyz.zoogame_.databinding.ActivityRozetSayfasiBinding

class RozetSayfasiActivity : AppCompatActivity() {

    private lateinit var binding:ActivityRozetSayfasiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRozetSayfasiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonRozetKazanmaK.setOnClickListener {
            val intent = Intent(this@RozetSayfasiActivity,UsakGirisActivity::class.java)
            startActivity(intent)
        }

    }
}
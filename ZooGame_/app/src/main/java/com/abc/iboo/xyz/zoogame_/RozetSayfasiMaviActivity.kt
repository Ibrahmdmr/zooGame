package com.abc.iboo.xyz.zoogame_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abc.iboo.xyz.zoogame_.databinding.ActivityRozetSayfasiMaviBinding

class RozetSayfasiMaviActivity : AppCompatActivity() {

    private lateinit var binding:ActivityRozetSayfasiMaviBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRozetSayfasiMaviBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonRozetKazanmaM.setOnClickListener {
            val intent = Intent(this@RozetSayfasiMaviActivity,UsakGirisActivity::class.java)
            startActivity(intent)
        }

    }
}
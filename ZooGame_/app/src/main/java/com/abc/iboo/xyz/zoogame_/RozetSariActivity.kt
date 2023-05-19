package com.abc.iboo.xyz.zoogame_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abc.iboo.xyz.zoogame_.databinding.ActivityRozetSariBinding

class RozetSariActivity : AppCompatActivity() {

    private lateinit var binding:ActivityRozetSariBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRozetSariBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonRozetKazanmaS.setOnClickListener {
            val intent = Intent(this@RozetSariActivity,UsakGirisActivity::class.java)
            startActivity(intent)
        }

    }
}
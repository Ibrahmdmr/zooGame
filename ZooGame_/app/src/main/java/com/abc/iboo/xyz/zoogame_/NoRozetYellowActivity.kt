package com.abc.iboo.xyz.zoogame_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abc.iboo.xyz.zoogame_.databinding.ActivityNoRozetYellowBinding

class NoRozetYellowActivity : AppCompatActivity() {

    private lateinit var binding:ActivityNoRozetYellowBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNoRozetYellowBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonRozetKaybetmeS.setOnClickListener {
        val intent = Intent(this@NoRozetYellowActivity,UsakGirisActivity::class.java)
        startActivity(intent)
        }

    }
}
package com.abc.iboo.xyz.zoogame_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abc.iboo.xyz.zoogame_.databinding.ActivityUsakGirisBinding

class UsakGirisActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUsakGirisBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUsakGirisBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.imageViewUsakSec.setOnClickListener {

            val intent = Intent(this@UsakGirisActivity,KurallarActivity::class.java)
            startActivity(intent)

        }

    }
}
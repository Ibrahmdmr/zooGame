package com.abc.iboo.xyz.zoogame_

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abc.iboo.xyz.zoogame_.databinding.ActivityCeylanBinding

class CeylanActivity : AppCompatActivity() {

    private lateinit var binding:ActivityCeylanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCeylanBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.imageViewCeylanileriK.setOnClickListener {

            val ceylan_metin = binding.editTextCeylanK.text.toString()

            val sp = getSharedPreferences("harfler", Context.MODE_PRIVATE)
            val editor = sp.edit()
            editor.putString("ceylan_metin",ceylan_metin)
            editor.apply()

            val intent = Intent(this@CeylanActivity,tavsanActivity::class.java)
            startActivity(intent)

        }

        binding.imageViewCeylanKameraK.setOnClickListener {
            val intent = Intent(this@CeylanActivity, QRActivity::class.java)
            startActivity(intent)
        }


        binding.imageViewCeylanLinkK.setOnClickListener {
            val url = "https://www.anatoliascience.com/kirmizi/html/ceylank.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

        binding.cardCeylanQRKirmizi.setOnClickListener {
            val url = "https://www.anatoliascience.com/kirmizi/html/ceylank.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

    }
}
package com.abc.iboo.xyz.zoogame_

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abc.iboo.xyz.zoogame_.databinding.ActivityCeylanMaviBinding

class CeylanMaviActivity : AppCompatActivity() {

    private lateinit var binding:ActivityCeylanMaviBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCeylanMaviBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewCeylanileriM.setOnClickListener {

            val ceylan_metin = binding.editTextCeylanM.text.toString()

            val sp = getSharedPreferences("harfler", Context.MODE_PRIVATE)
            val editor = sp.edit()
            editor.putString("ceylan_metin",ceylan_metin)
            editor.apply()

            val intent = Intent(this@CeylanMaviActivity,DeveMaviActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewCeylanKameraM.setOnClickListener {
            val intent = Intent(this@CeylanMaviActivity,QRActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewCeylanLinkM.setOnClickListener {
            val url = "https://www.anatoliascience.com/mavi/html/ceylanm.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

        binding.cardCeylanQRMavi.setOnClickListener {
            val url = "https://www.anatoliascience.com/mavi/html/ceylanm.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }


    }
}
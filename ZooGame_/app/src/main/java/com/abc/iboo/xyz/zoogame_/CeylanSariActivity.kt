package com.abc.iboo.xyz.zoogame_

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abc.iboo.xyz.zoogame_.databinding.ActivityCeylanSariBinding

class CeylanSariActivity : AppCompatActivity() {

    private lateinit var binding:ActivityCeylanSariBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCeylanSariBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewCeylanileriS.setOnClickListener {

            val ceylan_metin = binding.editTextCeylanS.text.toString()

            val sp = getSharedPreferences("harfler", Context.MODE_PRIVATE)
            val editor = sp.edit()
            editor.putString("ceylan_metin",ceylan_metin)
            editor.commit()

            val intent = Intent(this@CeylanSariActivity,DeveSariActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewCeylanKameraS.setOnClickListener {
            val intent = Intent(this@CeylanSariActivity,QRActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewCeylanLinkS.setOnClickListener {
            val url = "https://www.anatoliascience.com/sari/html/ceylans.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

        binding.cardCeylanQRsari.setOnClickListener {
            val url = "https://www.anatoliascience.com/sari/html/ceylans.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }


    }
}
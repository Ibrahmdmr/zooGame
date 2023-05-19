package com.abc.iboo.xyz.zoogame_

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abc.iboo.xyz.zoogame_.databinding.ActivityOrdekSariBinding

class OrdekSariActivity : AppCompatActivity() {

    private lateinit var binding:ActivityOrdekSariBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrdekSariBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewOrdekileriS.setOnClickListener {

            val ordek_metin = binding.editTextOrdekS.text.toString()

            val sp = getSharedPreferences("harfler", Context.MODE_PRIVATE)
            val editor = sp.edit()
            editor.putString("ordek_metin",ordek_metin)
            editor.commit()

            val intent = Intent(this@OrdekSariActivity,LamaSariActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewOrdekKameraS.setOnClickListener {
            val intent = Intent(this@OrdekSariActivity,QRActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewOrdekLinkS.setOnClickListener {
            val url = "https://www.anatoliascience.com/sari/html/ordeks.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

        binding.cardOrdekQRsari.setOnClickListener {
            val url = "https://www.anatoliascience.com/sari/html/ordeks.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }


    }
}
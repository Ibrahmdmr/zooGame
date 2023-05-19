package com.abc.iboo.xyz.zoogame_

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abc.iboo.xyz.zoogame_.databinding.ActivityOrdekBinding

class OrdekActivity : AppCompatActivity() {

    private lateinit var binding:ActivityOrdekBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrdekBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.imageViewOrdekileriK.setOnClickListener {

            val ordek_metin = binding.editTextOrdekK.text.toString()

            val sp = getSharedPreferences("harfler", Context.MODE_PRIVATE)
            val editor = sp.edit()
            editor.putString("ordek_metin",ordek_metin)
            editor.commit()

            val intent = Intent(this@OrdekActivity,LamaActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewOrdekKameraK.setOnClickListener {
            val intent = Intent(this@OrdekActivity,QRActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewOrdekLinkK.setOnClickListener {
            val url = "https://www.anatoliascience.com/kirmizi/html/ordekk.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

        binding.cardOrdekQRKirmizi.setOnClickListener {
            val url = "https://www.anatoliascience.com/kirmizi/html/ordekk.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

    }
}
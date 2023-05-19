package com.abc.iboo.xyz.zoogame_

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abc.iboo.xyz.zoogame_.databinding.ActivityOrdekMaviBinding

class OrdekMaviActivity : AppCompatActivity() {

    private lateinit var binding:ActivityOrdekMaviBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrdekMaviBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewOrdekileriM.setOnClickListener {

            val ordek_metin = binding.editTextOrdekM.text.toString()

            val sp = getSharedPreferences("harfler", Context.MODE_PRIVATE)
            val editor = sp.edit()
            editor.putString("ordek_metin",ordek_metin)
            editor.commit()

            val intent = Intent(this@OrdekMaviActivity,KeciMaviActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewOrdekKameraM.setOnClickListener {
            val intent = Intent(this@OrdekMaviActivity,QRActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewOrdekLinkM.setOnClickListener {
            val url = "https://www.anatoliascience.com/mavi/html/ordekm.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

        binding.cardOrdekQRmavi.setOnClickListener {
            val url = "https://www.anatoliascience.com/mavi/html/ordekm.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

    }
}
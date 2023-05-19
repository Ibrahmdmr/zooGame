package com.abc.iboo.xyz.zoogame_

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.abc.iboo.xyz.zoogame_.databinding.ActivityTavsanMaviBinding

class TavsanMaviActivity : AppCompatActivity() {

    private lateinit var binding:ActivityTavsanMaviBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTavsanMaviBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewTavsanileriM.setOnClickListener {
            if (binding.editTextTavsanM.text.toString().isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Lütfen Videodan Aldığınız Harfi Giriniz",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val tavsan_metin = binding.editTextTavsanM.text.toString()

                val sp = getSharedPreferences("harfler", Context.MODE_PRIVATE)
                val editor = sp.edit()
                editor.putString("tavsan_metin", tavsan_metin)
                editor.commit()

                val intent = Intent(this@TavsanMaviActivity, CeylanMaviActivity::class.java)
                startActivity(intent)
            }
        }

        binding.imageViewTavsanKameraM.setOnClickListener {
            val intent = Intent(this@TavsanMaviActivity,QRActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewTavsanLinkM.setOnClickListener {
            val url = "https://www.anatoliascience.com/mavi/html/tavsanm.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

        binding.cardTavsanQRMavi.setOnClickListener {
            val url = "https://www.anatoliascience.com/mavi/html/tavsanm.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

    }
}
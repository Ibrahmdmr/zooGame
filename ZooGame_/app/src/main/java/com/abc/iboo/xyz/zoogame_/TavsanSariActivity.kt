package com.abc.iboo.xyz.zoogame_

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.abc.iboo.xyz.zoogame_.databinding.ActivityTavsanSariBinding

class TavsanSariActivity : AppCompatActivity() {

    private lateinit var binding:ActivityTavsanSariBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTavsanSariBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewTavsanileriS.setOnClickListener {
            if (binding.editTextTavsanS.text.toString().isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Lütfen Videodan Aldığınız Harfi Giriniz",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val tavsan_metin = binding.editTextTavsanS.text.toString()

                val sp = getSharedPreferences("harfler", Context.MODE_PRIVATE)
                val editor = sp.edit()
                editor.putString("tavsan_metin", tavsan_metin)
                editor.commit()

                val intent = Intent(this@TavsanSariActivity, BitisSayfasiSariActivity::class.java)
                startActivity(intent)
            }
        }

        binding.imageViewTavsanKameraS.setOnClickListener {
            val intent = Intent(this@TavsanSariActivity,QRActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewTavsanLinkS.setOnClickListener {
            val url = "https://www.anatoliascience.com/sari/html/tavsans.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

        binding.cardTavsanQRsari.setOnClickListener {
            val url = "https://www.anatoliascience.com/sari/html/tavsans.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }


    }
}
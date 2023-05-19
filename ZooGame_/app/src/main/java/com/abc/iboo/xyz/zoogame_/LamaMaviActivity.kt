package com.abc.iboo.xyz.zoogame_

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.abc.iboo.xyz.zoogame_.databinding.ActivityLamaMaviBinding

class LamaMaviActivity : AppCompatActivity() {

    private lateinit var binding:ActivityLamaMaviBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLamaMaviBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewLamaileriM.setOnClickListener {
            if (binding.editTextLamaM.text.toString().isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Lütfen Videodan Aldığınız Harfi Giriniz",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val lama_metin = binding.editTextLamaM.text.toString()

                val sp = getSharedPreferences("harfler", Context.MODE_PRIVATE)
                val editor = sp.edit()
                editor.putString("lama_metin", lama_metin)
                editor.commit()

                val intent = Intent(this@LamaMaviActivity, TavsanMaviActivity::class.java)
                startActivity(intent)
            }
        }

        binding.imageViewLamaKameraM.setOnClickListener {
            val intent = Intent(this@LamaMaviActivity,QRActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewLamaLinkM.setOnClickListener {
            val url = "https://www.anatoliascience.com/mavi/html/lamam.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

        binding.cardLamaQRMavi.setOnClickListener {
            val url = "https://www.anatoliascience.com/mavi/html/lamam.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

    }
}
package com.abc.iboo.xyz.zoogame_

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.abc.iboo.xyz.zoogame_.databinding.ActivityKeciMaviBinding

class KeciMaviActivity : AppCompatActivity() {

    private lateinit var binding:ActivityKeciMaviBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKeciMaviBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewKeciileriM.setOnClickListener {
            if (binding.editTextKeciM.text.toString().isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Lütfen Videodan Aldığınız Harfi Giriniz",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val keci_metin = binding.editTextKeciM.text.toString()

                val sp = getSharedPreferences("harfler", Context.MODE_PRIVATE)
                val editor = sp.edit()
                editor.putString("keci_metin", keci_metin)
                editor.commit()

                val intent = Intent(this@KeciMaviActivity, BitisSayfasiMaviActivity::class.java)
                startActivity(intent)
            }
        }

        binding.imageViewKeciKameraM.setOnClickListener {
            val intent = Intent(this@KeciMaviActivity,QRActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewKeciLinkM.setOnClickListener {
            val url = "https://www.anatoliascience.com/mavi/html/kecim.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

        binding.cardKeciQRmavi.setOnClickListener {
            val url = "https://www.anatoliascience.com/mavi/html/kecim.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }


    }
}
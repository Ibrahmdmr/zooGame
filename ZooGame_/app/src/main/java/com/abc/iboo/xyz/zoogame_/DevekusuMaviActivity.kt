package com.abc.iboo.xyz.zoogame_

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.abc.iboo.xyz.zoogame_.databinding.ActivityDevekusuMaviBinding

class DevekusuMaviActivity : AppCompatActivity() {

    private lateinit var binding:ActivityDevekusuMaviBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDevekusuMaviBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewDevekusuileriM.setOnClickListener {
            if (binding.editTextDevekusuM.text.toString().isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Lütfen Videodan Aldığınız Harfi Giriniz",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val devekusu_metin = binding.editTextDevekusuM.text.toString()

                val sp = getSharedPreferences("harfler", Context.MODE_PRIVATE)
                val editor = sp.edit()
                editor.putString("devekusu_metin", devekusu_metin)
                editor.commit()

                val intent = Intent(this@DevekusuMaviActivity, OrdekMaviActivity::class.java)
                startActivity(intent)
            }
        }

        binding.imageViewDevekusuKameraM.setOnClickListener {
            val intent = Intent(this@DevekusuMaviActivity,QRActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewDevekusuLinkM.setOnClickListener {
            val url = "https://www.anatoliascience.com/mavi/html/devekusum.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

        binding.cardDevekusuQRmavi.setOnClickListener {
            val url = "https://www.anatoliascience.com/mavi/html/devekusum.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

    }
}
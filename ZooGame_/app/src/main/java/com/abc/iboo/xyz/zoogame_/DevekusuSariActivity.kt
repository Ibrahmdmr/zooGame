package com.abc.iboo.xyz.zoogame_

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.abc.iboo.xyz.zoogame_.databinding.ActivityDevekusuSariBinding

class DevekusuSariActivity : AppCompatActivity() {

    private lateinit var binding:ActivityDevekusuSariBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDevekusuSariBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewDevekusuileriS.setOnClickListener {
            if (binding.editTextDevekusuS.text.toString().isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Lütfen Videodan Aldığınız Harfi Giriniz",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val devekusu_metin = binding.editTextDevekusuS.text.toString()

                val sp = getSharedPreferences("harfler", Context.MODE_PRIVATE)
                val editor = sp.edit()
                editor.putString("devekusu_metin", devekusu_metin)
                editor.commit()

                val intent = Intent(this@DevekusuSariActivity, OrdekSariActivity::class.java)
                startActivity(intent)
            }
        }

        binding.imageViewDevekusuKameraS.setOnClickListener {
            val intent = Intent(this@DevekusuSariActivity,QRActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewDevekusuLinkS.setOnClickListener {
            val url = "https://www.anatoliascience.com/sari/html/devekusus.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

        binding.cardDevekusuQRsari.setOnClickListener {
            val url = "https://www.anatoliascience.com/sari/html/devekusus.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

    }
}
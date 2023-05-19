package com.abc.iboo.xyz.zoogame_

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.abc.iboo.xyz.zoogame_.databinding.ActivityDeveKusuBinding

class DeveKusuActivity : AppCompatActivity() {

    private lateinit var binding:ActivityDeveKusuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDeveKusuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewDevekusuileriK.setOnClickListener {
            if (binding.editTextDvekusuK.text.toString().isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Lütfen Videodan Aldığınız Harfi Giriniz",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val devekusu_metin = binding.editTextDvekusuK.text.toString()

                val sp = getSharedPreferences("harfler", Context.MODE_PRIVATE)
                val editor = sp.edit()
                editor.putString("devekusu_metin", devekusu_metin)
                editor.commit()

                val intent = Intent(this@DeveKusuActivity, OrdekActivity::class.java)
                startActivity(intent)
            }
        }

        binding.imageViewDevekusuKameraK.setOnClickListener {
            val intent = Intent(this@DeveKusuActivity,QRActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewDevekusuLinkK.setOnClickListener {
            val url = "https://www.anatoliascience.com/kirmizi/html/devekusuk.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

        binding.cardDevekusuQRKirmizi.setOnClickListener {
            val url = "https://www.anatoliascience.com/kirmizi/html/devekusuk.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

    }
}
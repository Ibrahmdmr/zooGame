package com.abc.iboo.xyz.zoogame_

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.abc.iboo.xyz.zoogame_.databinding.ActivityLamaBinding

class LamaActivity : AppCompatActivity() {

    private lateinit var binding:ActivityLamaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLamaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewLamaileriK.setOnClickListener {
            if (binding.editTextLamaK.text.toString().isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Lütfen Videodan Aldığınız Harfi Giriniz",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val lama_metin = binding.editTextLamaK.text.toString()

                val sp = getSharedPreferences("harfler", Context.MODE_PRIVATE)
                val editor = sp.edit()
                editor.putString("lama_metin", lama_metin)
                editor.commit()

                val intent = Intent(this@LamaActivity, MidilliActivity::class.java)
                startActivity(intent)
            }
        }

        binding.imageViewLamaKameraK.setOnClickListener {
            val intent = Intent(this@LamaActivity,QRActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewLamaLinkK.setOnClickListener {
            val url = "https://www.anatoliascience.com/kirmizi/html/lamak.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

        binding.cardLamaQRKirmizi.setOnClickListener {
            val url = "https://www.anatoliascience.com/kirmizi/html/lamak.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

    }
}
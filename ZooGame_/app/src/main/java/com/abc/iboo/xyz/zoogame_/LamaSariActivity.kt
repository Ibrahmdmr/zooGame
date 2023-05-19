package com.abc.iboo.xyz.zoogame_

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.abc.iboo.xyz.zoogame_.databinding.ActivityLamaSariBinding

class LamaSariActivity : AppCompatActivity() {

    private lateinit var binding:ActivityLamaSariBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLamaSariBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewLamaileriS.setOnClickListener {
            if (binding.editTextLamaS.text.toString().isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Lütfen Videodan Aldığınız Harfi Giriniz",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val lama_metin = binding.editTextLamaS.text.toString()

                val sp = getSharedPreferences("harfler", Context.MODE_PRIVATE)
                val editor = sp.edit()
                editor.putString("lama_metin", lama_metin)
                editor.commit()

                val intent = Intent(this@LamaSariActivity, MidilliSariActivity::class.java)
                startActivity(intent)
            }
        }

        binding.imageViewLamaKameraS.setOnClickListener {
            val intent = Intent(this@LamaSariActivity,QRActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewLamaLinkS.setOnClickListener {
            val url = "https://www.anatoliascience.com/sari/html/lamas.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

        binding.cardLamaQRsari.setOnClickListener {
            val url = "https://www.anatoliascience.com/sari/html/lamas.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }


    }
}
package com.abc.iboo.xyz.zoogame_

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.abc.iboo.xyz.zoogame_.databinding.ActivityMidilliBinding

class MidilliActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMidilliBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMidilliBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewMidilliileriK.setOnClickListener {
            if (binding.editTextMidilliK.text.toString().isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Lütfen Videodan Aldığınız Harfi Giriniz",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val midilli_metin = binding.editTextMidilliK.text.toString()

                val sp = getSharedPreferences("harfler", Context.MODE_PRIVATE)
                val editor = sp.edit()
                editor.putString("midilli_metin", midilli_metin)
                editor.commit()

                val intent = Intent(this@MidilliActivity, BitisSayfasiActivity::class.java)
                startActivity(intent)
            }
        }

        binding.imageViewMidilliKameraK.setOnClickListener {
            val intent = Intent(this@MidilliActivity,QRActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewMidilliLinkK.setOnClickListener {
            val url = "https://www.anatoliascience.com/kirmizi/html/midillik.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

        binding.cardMidilliQRKirmizi.setOnClickListener {
            val url = "https://www.anatoliascience.com/kirmizi/html/midillik.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

    }
}
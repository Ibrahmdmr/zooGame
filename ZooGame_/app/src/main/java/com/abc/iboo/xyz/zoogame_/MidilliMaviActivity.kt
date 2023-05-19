package com.abc.iboo.xyz.zoogame_

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.abc.iboo.xyz.zoogame_.databinding.ActivityMidilliMaviBinding

class MidilliMaviActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMidilliMaviBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMidilliMaviBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewMidilliileriM.setOnClickListener {
            if (binding.editTextMidilliM.text.toString().isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Lütfen Videodan Aldığınız Harfi Giriniz",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val midilli_metin = binding.editTextMidilliM.text.toString()

                val sp = getSharedPreferences("harfler", Context.MODE_PRIVATE)
                val editor = sp.edit()
                editor.putString("midilli_metin", midilli_metin)
                editor.commit()

                val intent = Intent(this@MidilliMaviActivity, LamaMaviActivity::class.java)
                startActivity(intent)
            }
        }

        binding.imageViewMidilliKameraM.setOnClickListener {
            val intent = Intent(this@MidilliMaviActivity,QRActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewMidilliLinkM.setOnClickListener {
            val url = "https://www.anatoliascience.com/mavi/html/midillim.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

        binding.cardMidilliQRMavi.setOnClickListener {
            val url = "https://www.anatoliascience.com/mavi/html/midillim.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

    }
}
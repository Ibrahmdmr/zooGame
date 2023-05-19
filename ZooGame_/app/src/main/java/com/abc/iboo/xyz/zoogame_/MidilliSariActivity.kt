package com.abc.iboo.xyz.zoogame_

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.abc.iboo.xyz.zoogame_.databinding.ActivityMidilliSariBinding

class MidilliSariActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMidilliSariBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMidilliSariBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewMidilliileriS.setOnClickListener {
            if (binding.editTextMidilliS.text.toString().isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Lütfen Videodan Aldığınız Harfi Giriniz",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val midilli_metin = binding.editTextMidilliS.text.toString()

                val sp = getSharedPreferences("harfler", Context.MODE_PRIVATE)
                val editor = sp.edit()
                editor.putString("midilli_metin", midilli_metin)
                editor.commit()

                val intent = Intent(this@MidilliSariActivity, KeciSariActivity::class.java)
                startActivity(intent)
            }
        }

        binding.imageViewMidilliKameraS.setOnClickListener {
            val intent = Intent(this@MidilliSariActivity,QRActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewMidilliLinkS.setOnClickListener {
            val url = "https://www.anatoliascience.com/sari/html/midillis.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

        binding.cardMidilliQRsari.setOnClickListener {
            val url = "https://www.anatoliascience.com/sari/html/midillis.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }


    }
}
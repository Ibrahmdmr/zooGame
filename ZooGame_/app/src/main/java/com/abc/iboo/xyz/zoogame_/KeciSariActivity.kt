package com.abc.iboo.xyz.zoogame_

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.abc.iboo.xyz.zoogame_.databinding.ActivityKeciSariBinding

class KeciSariActivity : AppCompatActivity() {

    private lateinit var binding:ActivityKeciSariBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKeciSariBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewKeciileriS.setOnClickListener {
            if (binding.editTextKeciS.text.toString().isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Lütfen Videodan Aldığınız Harfi Giriniz",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val keci_metin = binding.editTextKeciS.text.toString()

                val sp = getSharedPreferences("harfler", Context.MODE_PRIVATE)
                val editor = sp.edit()
                editor.putString("keci_metin", keci_metin)
                editor.commit()

                val intent = Intent(this@KeciSariActivity, CeylanSariActivity::class.java)
                startActivity(intent)
            }
        }

        binding.imageViewKeciKameraS.setOnClickListener {
            val intent = Intent(this@KeciSariActivity,QRActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewKeciLinkS.setOnClickListener {
            val url = "https://www.anatoliascience.com/sari/html/kecis.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

        binding.cardKeciQRsari.setOnClickListener {
            val url = "https://www.anatoliascience.com/sari/html/kecis.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }


    }
}
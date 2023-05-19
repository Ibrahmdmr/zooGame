package com.abc.iboo.xyz.zoogame_

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.abc.iboo.xyz.zoogame_.databinding.ActivityDeveMaviBinding

class DeveMaviActivity : AppCompatActivity() {

    private lateinit var binding:ActivityDeveMaviBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDeveMaviBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewDeveileriM.setOnClickListener {
            if (binding.editTextDeveM.text.toString().isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Lütfen Videodan Aldığınız Harfi Giriniz",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val deve_metin = binding.editTextDeveM.text.toString()

                val sp = getSharedPreferences("harfler", Context.MODE_PRIVATE)
                val editor = sp.edit()
                editor.putString("deve_metin", deve_metin)
                editor.commit()

                val intent = Intent(this@DeveMaviActivity, DevekusuMaviActivity::class.java)
                startActivity(intent)
            }
        }

        binding.imageViewDeveKameraM.setOnClickListener {
            val intent = Intent(this@DeveMaviActivity,QRActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewDeveLinkM.setOnClickListener {
            val url = "https://www.anatoliascience.com/mavi/html/devem.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

        binding.cardDeveQRmavi.setOnClickListener {
            val url = "https://www.anatoliascience.com/mavi/html/devem.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

    }
}
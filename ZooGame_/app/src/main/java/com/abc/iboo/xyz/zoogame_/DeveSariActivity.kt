package com.abc.iboo.xyz.zoogame_

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.abc.iboo.xyz.zoogame_.databinding.ActivityDeveSariBinding

class DeveSariActivity : AppCompatActivity() {

    private lateinit var binding:ActivityDeveSariBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDeveSariBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewDeveileriS.setOnClickListener {
            if (binding.editTextDeveS.text.toString().isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Lütfen Videodan Aldığınız Harfi Giriniz",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val deve_metin = binding.editTextDeveS.text.toString()

                val sp = getSharedPreferences("harfler", Context.MODE_PRIVATE)
                val editor = sp.edit()
                editor.putString("deve_metin", deve_metin)
                editor.commit()

                val intent = Intent(this@DeveSariActivity, TavsanSariActivity::class.java)
                startActivity(intent)
            }
        }

        binding.imageViewDeveKameraS.setOnClickListener {
            val intent = Intent(this@DeveSariActivity,QRActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewDeveLinkS.setOnClickListener {
            val url = "https://www.anatoliascience.com/sari/html/deves.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

        binding.cardDeveQRsari.setOnClickListener {
            val url = "https://www.anatoliascience.com/sari/html/deves.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }


    }
}
package com.abc.iboo.xyz.zoogame_

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.abc.iboo.xyz.zoogame_.databinding.ActivityTavsanBinding

class tavsanActivity : AppCompatActivity() {

    private lateinit var binding:ActivityTavsanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTavsanBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.imageViewTavsanileriK.setOnClickListener {
            if (binding.editTextTavsanK.text.toString().isEmpty()){
                Toast.makeText(applicationContext,"Lütfen Videodan Aldığınız Harfi Giriniz",Toast.LENGTH_SHORT).show()
            }
            else {
                val tavsan_metin = binding.editTextTavsanK.text.toString()

                val sp = getSharedPreferences("harfler", Context.MODE_PRIVATE)
                val editor = sp.edit()
                editor.putString("tavsan_metin", tavsan_metin)
                editor.commit()

                val intent = Intent(this@tavsanActivity, DeveKusuActivity::class.java)
                startActivity(intent)
            }
        }

        binding.imageViewTavsanKameraK.setOnClickListener {
            val intent = Intent(this@tavsanActivity,QRActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewTavsanLinkK.setOnClickListener {
            val url = "https://www.anatoliascience.com/kirmizi/html/tavsank.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

        binding.cardTavsanQRKirmizi.setOnClickListener {
            val url = "https://www.anatoliascience.com/kirmizi/html/tavsank.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

    }
}
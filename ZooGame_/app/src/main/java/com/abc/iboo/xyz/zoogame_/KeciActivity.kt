package com.abc.iboo.xyz.zoogame_

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import com.abc.iboo.xyz.zoogame_.databinding.ActivityKeciBinding

class KeciActivity : AppCompatActivity() {

    private lateinit var binding:ActivityKeciBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKeciBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewKeciileriK.setOnClickListener {
            if (binding.editTextKeciK.text.toString().isEmpty()){
                Toast.makeText(applicationContext,"Lütfen Videodan Aldığınız Harfi Giriniz",Toast.LENGTH_SHORT).show()
            }
            else {
                val keci_metin = binding.editTextKeciK.text.toString()

                val sp = getSharedPreferences("harfler", Context.MODE_PRIVATE)
                val editor = sp.edit()
                editor.putString("keci_metin", keci_metin)
                editor.commit()

                val intent = Intent(this@KeciActivity, CeylanActivity::class.java)
                startActivity(intent)
            }
        }

        binding.imageViewKameraKeciK.setOnClickListener {
            val intent = Intent(this@KeciActivity,QRActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewKeciLinkK.setOnClickListener {
            val url = "https://www.anatoliascience.com/kirmizi/html/kecik.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

        binding.cardKeciQRKirmizi.setOnClickListener {
            val url = "https://www.anatoliascience.com/kirmizi/html/kecik.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

    }
}
package com.abc.iboo.xyz.zoogame_

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import androidx.core.os.bundleOf
import com.abc.iboo.xyz.zoogame_.databinding.ActivityDeveBinding

class DeveActivity : AppCompatActivity() {

    private lateinit var binding:ActivityDeveBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDeveBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.imageViewDeveileriK.setOnClickListener {
            if (binding.editTextDeveK.text.toString().isEmpty()){
                Toast.makeText(applicationContext,"Lütfen Videodan Aldığınız Harfi Giriniz",Toast.LENGTH_SHORT).show()
            }
           else {
                val deve_metin = binding.editTextDeveK.text.toString()

                val sp = getSharedPreferences("harfler", Context.MODE_PRIVATE)
                val editor = sp.edit()
                editor.putString("deve_metin", deve_metin)
                editor.commit()

                val intent = Intent(this@DeveActivity, KeciActivity::class.java)
                startActivity(intent)
            }
        }


        binding.imageViewDeveKameraK.setOnClickListener {
            val intent = Intent(this@DeveActivity, QRActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewDeveLinkK.setOnClickListener {
            val url = "https://www.anatoliascience.com/kirmizi/html/devek.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

        binding.cardDeveQRKirmizi.setOnClickListener {
            val url = "https://www.anatoliascience.com/kirmizi/html/devek.html"

            if (url != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }

    }
}
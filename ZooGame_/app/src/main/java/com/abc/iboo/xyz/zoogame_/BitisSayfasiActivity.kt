package com.abc.iboo.xyz.zoogame_

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.abc.iboo.xyz.zoogame_.databinding.ActivityBitisSayfasiBinding

class BitisSayfasiActivity : AppCompatActivity() {

    private lateinit var binding:ActivityBitisSayfasiBinding
    private var kontrolhak = 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBitisSayfasiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sp = getSharedPreferences("harfler", Context.MODE_PRIVATE)
        val editor = sp.edit()

        //deve
        val deve =  sp.getString("deve_metin","")
        editor.apply()

        binding.textViewDeveGelenK.text = deve.toString()

        //keci
        val keci =  sp.getString("keci_metin","")
        editor.apply()

        binding.textViewKeciGelenK.text = keci.toString()

       //ceylan
     //   val ceylan =  sp.getString("ceylan_metin","")
     //   editor.commit()

   //     binding.text.text = ceylan.toString()

        //tavsan
        val tavsan =  sp.getString("tavsan_metin","")
        editor.apply()

        binding.textViewTavsanGelenK.text = tavsan.toString()

        //devekusu
        val devekusu =  sp.getString("devekusu_metin","")
        editor.apply()

        binding.textViewDevekusuGelenK.text = devekusu.toString()

        //ordek
    //    val ordek =  sp.getString("ordek_metin","")
      //  editor.commit()

        //binding.te.text = ordek.toString()

        //lama
        val lama =  sp.getString("lama_metin","")
        editor.apply()

        binding.textViewLamaGelenK.text = lama.toString()

        //midilli
        val midilli =  sp.getString("midilli_metin","")
        editor.apply()

        binding.textViewMidilliGelenK.text = midilli.toString()



        binding.textViewKontrolHakK.text = kontrolhak.toString()

        binding.imageViewKontrolK.setOnClickListener {


            if (binding.editTextBirinciK.text.toString().isEmpty() ||
                binding.editTextIkinciK.text.toString().isEmpty() ||
                binding.editTextUcuncuK.text.toString().isEmpty() ||
                binding.editTextDorduncuK.text.toString().isEmpty() ||
                binding.editTextBesinciK.text.toString().isEmpty() ||
                binding.editTextAltinciK.text.toString().isEmpty()){
                Toast.makeText(this,"Lütfen Anahtar Harfleri Girin",Toast.LENGTH_LONG).show()
            }
          else if (binding.editTextBirinciK.text.toString() == "Z" &&
                    binding.editTextIkinciK.text.toString() == "Ü" &&
                binding.editTextUcuncuK.text.toString() == "R" &&
                binding.editTextDorduncuK.text.toString() == "A" &&
                binding.editTextBesinciK.text.toString() == "F" &&
                binding.editTextAltinciK.text.toString() == "A"){
                startActivity(Intent(this@BitisSayfasiActivity,RozetSayfasiActivity::class.java))
                finish()
            }else{
                kontrolhak--
                binding.textViewKontrolHakK.text = kontrolhak.toString()
                Toast.makeText(this,"$kontrolhak Hakkınız Kaldı",Toast.LENGTH_SHORT).show()
            }

            if (kontrolhak == 0){
                startActivity(Intent(this@BitisSayfasiActivity,RozetKaybetmeActivity::class.java))
                finish()
            }

        }
        binding.textViewKontrolHakK.text = kontrolhak.toString()

    }

}
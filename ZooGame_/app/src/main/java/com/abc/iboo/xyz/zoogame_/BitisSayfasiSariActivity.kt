package com.abc.iboo.xyz.zoogame_

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.abc.iboo.xyz.zoogame_.databinding.ActivityBitisSayfasiSariBinding

class BitisSayfasiSariActivity : AppCompatActivity() {

    private lateinit var binding:ActivityBitisSayfasiSariBinding
    private var kontrolhakS = 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBitisSayfasiSariBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sp = getSharedPreferences("harfler", Context.MODE_PRIVATE)
        val editor = sp.edit()

        //deve
        val deve =  sp.getString("deve_metin","")
        editor.commit()

        binding.textViewGelenDeveS.text = deve.toString()

        //keci
        val keci =  sp.getString("keci_metin","")
        editor.commit()

        binding.textViewGelenKeciS.text = keci.toString()

    /*    //ceylan
        val ceylan =  sp.getString("ceylan_metin","")
        editor.commit()

        binding.te.text = ceylan.toString()*/

        //tavsan
        val tavsan =  sp.getString("tavsan_metin","")
        editor.commit()

        binding.textViewGelenTavsanS.text = tavsan.toString()

        //devekusu
        val devekusu =  sp.getString("devekusu_metin","")
        editor.commit()

        binding.textViewGelenDevekusuS.text = devekusu.toString()

      /*  //ordek
        val ordek =  sp.getString("ordek_metin","")
        editor.commit()

        binding..text = ordek.toString()*/

        //lama
        val lama =  sp.getString("lama_metin","")
        editor.commit()

        binding.textViewGelenLamaS.text = lama.toString()

        //midilli
        val midilli =  sp.getString("midilli_metin","")
        editor.commit()

        binding.textViewGelenMidilliS.text = midilli.toString()


        binding.textViewHakSayisiS.text = kontrolhakS.toString()

        binding.imageViewKontrolSari.setOnClickListener {


            if (binding.editTextBirinciS.text.toString().isEmpty() ||
                binding.editTextIkinciS.text.toString().isEmpty() ||
                binding.editTextUcuncuS.text.toString().isEmpty() ||
                binding.editTextDorduncuS.text.toString().isEmpty() ||
                binding.editTextBesinciS.text.toString().isEmpty() ||
                binding.editTextAltinciS.text.toString().isEmpty()){
                Toast.makeText(this,"Lütfen Anahtar Harfleri Girin",Toast.LENGTH_LONG).show()
            }
           else if (binding.editTextBirinciS.text.toString() == "Z" &&
                binding.editTextIkinciS.text.toString() == "Ü" &&
                binding.editTextUcuncuS.text.toString() == "R" &&
                binding.editTextDorduncuS.text.toString() == "A" &&
                binding.editTextBesinciS.text.toString() == "F" &&
                binding.editTextAltinciS.text.toString() == "A"){
                val intent = Intent(this@BitisSayfasiSariActivity,RozetSariActivity::class.java)
                startActivity(intent)
                finish()
            }else{
                kontrolhakS--
                binding.textViewHakSayisiS.text = kontrolhakS.toString()
                Toast.makeText(this,"${kontrolhakS} Hakkınız Kaldı",Toast.LENGTH_SHORT).show()
            }

            if (kontrolhakS == 0){
                startActivity(Intent(this@BitisSayfasiSariActivity,NoRozetYellowActivity::class.java))
                finish()
            }

        }
        binding.textViewHakSayisiS.text = kontrolhakS.toString()


    }
}
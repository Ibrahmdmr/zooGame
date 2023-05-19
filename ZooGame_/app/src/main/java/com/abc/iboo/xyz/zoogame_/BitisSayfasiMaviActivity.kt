package com.abc.iboo.xyz.zoogame_

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.abc.iboo.xyz.zoogame_.databinding.ActivityBitisSayfasiMaviBinding

class BitisSayfasiMaviActivity : AppCompatActivity() {

    private lateinit var binding:ActivityBitisSayfasiMaviBinding
    private var kontrolhakM = 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBitisSayfasiMaviBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sp = getSharedPreferences("harfler", Context.MODE_PRIVATE)
        val editor = sp.edit()

        //deve
        val deve =  sp.getString("deve_metin","")
        editor.commit()

        binding.textViewGelenDeveM.text = deve.toString()

        //keci
        val keci =  sp.getString("keci_metin","")
        editor.commit()

        binding.textViewGelenKeciM.text = keci.toString()

       /* //ceylan
        val ceylan =  sp.getString("ceylan_metin","")
        editor.commit()

        binding.textg.text = ceylan.toString()*/

        //tavsan
        val tavsan =  sp.getString("tavsan_metin","")
        editor.commit()

        binding.textViewGelenTavsanM.text = tavsan.toString()

        //devekusu
        val devekusu =  sp.getString("devekusu_metin","")
        editor.commit()

        binding.textViewGelenDevekusuM.text = devekusu.toString()

     /*   //ordek
        val ordek =  sp.getString("ordek_metin","")
        editor.commit()

        binding.textgele.text = ordek.toString()*/

        //lama
        val lama =  sp.getString("lama_metin","")
        editor.commit()

        binding.textViewGelenLamaM.text = lama.toString()

        //midilli
        val midilli =  sp.getString("midilli_metin","")
        editor.commit()

        binding.textViewGelenMidilliM.text = midilli.toString()


        binding.textViewKntrolhakM.text = kontrolhakM.toString()

        binding.imageViewKontrolM.setOnClickListener {


            if (binding.editTextBirinciM.text.toString().isEmpty() ||
                binding.editTextIkinciM.text.toString().isEmpty() ||
                binding.editTextUcuncuM.text.toString().isEmpty() ||
                binding.editTextDorduncuM.text.toString().isEmpty() ||
                binding.editTextBesinciM.text.toString().isEmpty() ||
                binding.editTextAltinciM.text.toString().isEmpty()){
                Toast.makeText(this,"Lütfen Anahtar Harfleri Girin",Toast.LENGTH_LONG).show()
            }
            else if (binding.editTextBirinciM.text.toString() == "Z" &&
                binding.editTextIkinciM.text.toString() == "Ü" &&
                binding.editTextUcuncuM.text.toString() == "R" &&
                binding.editTextDorduncuM.text.toString() == "A" &&
                binding.editTextBesinciM.text.toString() == "F" &&
                binding.editTextAltinciM.text.toString() == "A"){
                val intent = Intent(this@BitisSayfasiMaviActivity,RozetSayfasiMaviActivity::class.java)
                startActivity(intent)
                finish()
            }else{
                kontrolhakM--
                binding.textViewKntrolhakM.text = kontrolhakM.toString()
                Toast.makeText(this,"${kontrolhakM} Hakkınız Kaldı",Toast.LENGTH_SHORT).show()
            }

            if (kontrolhakM == 0){
                startActivity(Intent(this@BitisSayfasiMaviActivity,NoRozetBlueActivity::class.java))
                finish()
            }

        }
        binding.textViewKntrolhakM.text = kontrolhakM.toString()

    }

}
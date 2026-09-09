package br.com.devandroid.appgastocombustivel

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.com.devandroid.appgastocombustivel.databinding.ActivityDistanciaEmKmactivityBinding

class DistanciaEmKMActivity : AppCompatActivity() {

    private val binding by lazy { ActivityDistanciaEmKmactivityBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        setSupportActionBar( binding.materialToolbar )
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val preco = intent.getStringExtra("preco")
        val consumo = intent.getStringExtra("consumo")

        binding.btCalcular.setOnClickListener {

            val distancia = binding.editDistancia.text.toString()

            if(distancia.isNotEmpty()){
                val intent = Intent(this, ResultadoActivity::class.java)
                intent.putExtra("distancia", distancia)
                intent.putExtra("preco", preco)
                intent.putExtra("consumo", consumo)
                startActivity(intent)
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            }else{
                Toast.makeText(this, "Campo vázio", Toast.LENGTH_SHORT).show()
            }


        }

    }
}
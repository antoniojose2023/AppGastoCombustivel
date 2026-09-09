package br.com.devandroid.appgastocombustivel

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.com.devandroid.appgastocombustivel.databinding.ActivityConsumoCombustivelBinding

class ConsumoCombustivelActivity : AppCompatActivity() {

    private val binding by lazy { ActivityConsumoCombustivelBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        setSupportActionBar(binding.materialToolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)


        val preco = intent.getStringExtra("preco")

        binding.bProximo.setOnClickListener {

            val consumo = binding.editConsumoCombustivel.text.toString()

            if(consumo.isNotEmpty()){
                val intent = Intent(this, DistanciaEmKMActivity::class.java)
                intent.putExtra("consumo", consumo)
                intent.putExtra("preco", preco)
                startActivity(intent)
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            }else{
                Toast.makeText(this, "Campo vázio", Toast.LENGTH_SHORT).show()
            }

        }
    }
}
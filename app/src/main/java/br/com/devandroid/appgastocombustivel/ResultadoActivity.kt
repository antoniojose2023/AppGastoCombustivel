package br.com.devandroid.appgastocombustivel

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.com.devandroid.appgastocombustivel.databinding.ActivityDistanciaEmKmactivityBinding
import br.com.devandroid.appgastocombustivel.databinding.ActivityResultadoBinding
import java.util.Locale

class ResultadoActivity : AppCompatActivity() {

    private val binding by lazy { ActivityResultadoBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val preco = intent.getStringExtra("preco")
        val consumo = intent.getStringExtra("consumo")
        val distancia = intent.getStringExtra("distancia")

        if(preco!!.isNotEmpty() && consumo!!.isNotEmpty() && distancia!!.isNotEmpty())
            calculaGastos( preco, consumo, distancia )

        binding.btVoltarHome.setOnClickListener {
             startActivity(Intent(this, MainActivity::class.java))
             overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
    }

    fun calculaGastos(preco: String, consumo: String, distancia: String){

        val precoConvertido = preco.toDouble()
        val consumoConvertido = consumo.toInt()
        val distanciaConvertido = distancia.toInt()

        val litrosNecessarios = (distanciaConvertido / consumoConvertido )
        val gasto = litrosNecessarios * precoConvertido

        binding.tvResultadoDistancia.text = "$distanciaConvertido km"
        binding.tvResultadoConsumo.text = "$litrosNecessarios  L"

        val precoFormatado = getValorFormatado( precoConvertido )
        binding.tvResultadoPreOLitro.text = "R$ $precoFormatado"

        val gastoFormatado = getValorFormatado(gasto)
        binding.txtGastoTotal.text = "R$ ${gastoFormatado}"
    }

    fun getValorFormatado(gasto: Double): String{
          return String.format(Locale("pt", "br"),"%.2f", gasto)
    }
}
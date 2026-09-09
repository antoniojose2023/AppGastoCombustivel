package br.com.devandroid.appgastocombustivel

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.com.devandroid.appgastocombustivel.databinding.ActivityPrecoCombustivelBinding

class PrecoCombustivelActivity : AppCompatActivity() {

    val binding by lazy { ActivityPrecoCombustivelBinding.inflate(layoutInflater) }

    @SuppressLint("RestrictedApi")
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

        binding.btProximo.setOnClickListener {
              val preco = binding.editPrecoCombustivel.text.toString()

              if(preco.isNotEmpty()){
                  val intent = Intent(this, ConsumoCombustivelActivity::class.java)
                  intent.putExtra("preco", preco)
                  startActivity(intent)
                  overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
              }else{
                  Toast.makeText(this, "Campo vázio", Toast.LENGTH_SHORT).show()
              }


        }

    }
}
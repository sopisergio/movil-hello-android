    package com.Rodriguez.helloandroid


    import android.os.Bundle
    import androidx.appcompat.app.AppCompatActivity
    import android.widget.Button
    import android.widget.TextView
    import android.widget.Toast

    class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val textView = findViewById<TextView>(R.id.txtSaludo)
            val btnSaludo = findViewById<Button>(R.id.btnSaludo)

            var contador = 0

            btnSaludo.setOnClickListener {
                contador++
                textView.text = "Has hecho clic $contador veces"

                Toast.makeText(
                    this,
                    "¡Botón presionado!",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
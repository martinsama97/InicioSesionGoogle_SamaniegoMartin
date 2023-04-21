package samaniego.martin.iniciogoogle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
        val tv_nombre: TextView = findViewById(R.id.tv_nombre)
        val tv_email: TextView = findViewById(R.id.tv_email)
        val btn_cerrar: Button = findViewById(R.id.btn_cerrar)

        val bundle = intent.extras
        if (bundle != null){
            val nombre = bundle.getString("name")
            val correo = bundle.getString("email")

            tv_nombre.setText(nombre)
            tv_email.setText(correo)
        }

        btn_cerrar.setOnClickListener {
            finish()
        }
    }
}
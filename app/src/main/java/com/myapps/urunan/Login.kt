package com.myapps.urunan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val namapengguna = findViewById<EditText>(R.id.namapengguna)
        val katasandi = findViewById<EditText>(R.id.katasandi)
        val masuk = findViewById<Button>(R.id.masuk)

        masuk.setOnClickListener {

            val namapengguna = namapengguna.text.toString()
            val katasandi = katasandi.text.toString()

            val intent =Intent (this@Login, Dashboard::class.java)
            intent.putExtra ("Nama Pengguna", namapengguna)
            intent.putExtra ("Kata Sandi", katasandi)
            startActivity(intent)
        }
    }
}
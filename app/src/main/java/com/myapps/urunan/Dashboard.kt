package com.myapps.urunan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)

        var intent = intent
        val namapengguna = intent.getStringExtra( "Nama Pengguna" )
        val katasandi = intent.getStringExtra("Kata Sandi")

        val tampilnama = findViewById<TextView>(R.id.tampilnama)

        tampilnama.text =  "Selamat datang : "+namapengguna
    }
}
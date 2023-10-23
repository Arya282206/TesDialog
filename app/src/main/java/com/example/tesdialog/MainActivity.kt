package com.example.tesdialog

import android.annotation.SuppressLint
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    @SuppressLint("InflateParams")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tombol = findViewById<Button>(R.id.TombolDialog)
        val masukannama = findViewById<Button>(R.id.kelas)

        tombol.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Judul")
                .setMessage("Nama: Febi Aryadi")
                .setPositiveButton("Yes", { dialogInterface, i ->
                    Toast.makeText(this, "Tombol Yes Ditekan", Toast.LENGTH_LONG).show()
                })
                .setNegativeButton("No",{ dialogInterface, i ->
                    Toast.makeText(this, "Tombol No Ditekan", Toast.LENGTH_LONG).show()
                })
                .show()
        }

        masukannama.setOnClickListener {
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.activity_main2, null)
            val editText = dialogLayout.findViewById<EditText>(R.id.editText)
            val dialogInterface = inflater.inflate(R.layout.activity_main2, null)
            var positiveButton : AlertDialog.Builder = AlertDialog.Builder(this)
            val dialoglayout = null
            AlertDialog.Builder(this)
                .setTitle("Masukkan Nama Lengkap")
                .setView(dialoglayout)
                // Add action buttons
                .setPositiveButton("Benar",
                    DialogInterface.OnClickListener { dialogInterface, i ->
                        Toast.makeText(this,"Nama kamu adalah " + editText.getText().toString(), Toast.LENGTH_SHORT).show()
                    })
                .setNegativeButton("Batal",
                    DialogInterface.OnClickListener { dialogInterface, i ->
                    }) .show()

        }

    }
}
package com.practica.agenda

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.practica.agenda.ItemProvider.Companion.itemsList
import com.practica.agenda.adapter.ItemAdapter


class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewItem)
        val fab: FloatingActionButton = findViewById(R.id.fab)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ItemAdapter(ItemProvider.itemsList)
        initRecyclerView()
        fab.setOnClickListener {
            shareResourceList()
        }




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun shareResourceList() {
        val resourceText = buildString {
            // Recorre tu lista de recursos y agrégales el formato
            itemsList.forEach { item ->
                append("Nombre: ${item.title}\nTipo: ${item.type}\nURL: ${item.url}\n\n")
            }
        }

        // Crear un Intent para compartir
        val sendIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resourceText)  // Pasa el texto con la lista
            type = "text/plain"  // Tipo de contenido
        }

        // Verificar si existe alguna aplicación para manejar el Intent
        val shareIntent = Intent.createChooser(sendIntent, null)

        // Lanzar el Intent
        try {
            startActivity(shareIntent)
        } catch (e: Exception) {
            Toast.makeText(this, "No se puede compartir en este momento.", Toast.LENGTH_SHORT).show()
        }
    }


    private fun initRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewItem)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ItemAdapter(ItemProvider.itemsList)
    }
}








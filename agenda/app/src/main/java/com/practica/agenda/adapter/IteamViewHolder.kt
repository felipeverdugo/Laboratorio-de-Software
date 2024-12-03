package com.practica.agenda.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.practica.agenda.R
import com.practica.agenda.Item

class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val title: TextView = view.findViewById(R.id.item_title)
    val type: TextView = view.findViewById(R.id.item_type)


    fun render (itemModel : Item) {
        title.text = itemModel.title
        type.text =itemModel.type
    }
}
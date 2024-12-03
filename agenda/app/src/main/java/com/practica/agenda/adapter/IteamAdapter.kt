package com.practica.agenda.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.practica.agenda.R
import com.practica.agenda.Item



class ItemAdapter(private val itemsList: List<Item>) : RecyclerView.Adapter<ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int = itemsList.size


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = itemsList[position]

        val iconResource = when (item.type) {
            "cine"-> R.drawable.ic_video
            "web" -> R.drawable.ic_web
            "foto" -> R.drawable.ic_image
            else -> R.drawable.ic_other
        }

        holder.iconImageView.setImageResource(iconResource)
        holder.render(item)

    }

}
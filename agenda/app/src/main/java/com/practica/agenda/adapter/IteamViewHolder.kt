package com.practica.agenda.adapter

import android.content.Intent
import android.net.Uri
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivities
import androidx.recyclerview.widget.RecyclerView
import com.practica.agenda.Item
import com.practica.agenda.R

class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val iconImageView: ImageView = itemView.findViewById(R.id.ivItem_type)
    private val title: TextView = view.findViewById<TextView>(R.id.tvItemTitle)


    fun render (itemModel : Item) {
        title.text = itemModel.title


        itemView.setOnLongClickListener {
            val uri = Uri.parse(itemModel.url)
            val webIntent = arrayOf(  Intent().apply {
                action = Intent.ACTION_VIEW
                data = uri
            } )

            startActivities(title.context,webIntent)


            true
        }

    }


}
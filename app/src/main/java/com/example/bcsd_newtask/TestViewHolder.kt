package com.example.bcsd_newtask

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class TestViewHolder(view:View):RecyclerView.ViewHolder(view) {
    val txtName = itemView.findViewById<TextView>(R.id.text_title)
    val txtAge = itemView.findViewById<TextView>(R.id.text_content)
    val imageDraw = itemView.findViewById<ImageView>(R.id.draw_view)

    fun bind(item: TestData){
        txtName.text = item.name
        txtAge.text = item.age.toString()
        Glide.with(itemView).load(item.img).into(imageDraw)
    }
}
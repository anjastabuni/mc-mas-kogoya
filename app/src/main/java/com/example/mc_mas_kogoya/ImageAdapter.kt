package com.example.mc_mas_kogoya

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(private val context: Context, private val images : List<ItemImage>, val listener : (ItemImage) -> Unit)
    : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>(){
    class ImageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageSrc = view.findViewById<ImageView>(R.id.image)
        val title = view.findViewById<TextView>(R.id.titleItem)
        fun bindView(image: ItemImage, listener: (ItemImage) -> Unit){
            imageSrc.setImageResource(image.imageSrc)
            title.text = image.imageTitle
            itemView.setOnClickListener { listener(image) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder
            = ImageViewHolder(LayoutInflater.from(context).inflate(R.layout.item_image, parent, false))

    override fun getItemCount(): Int = images.size

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bindView(images[position], listener)
    }
}
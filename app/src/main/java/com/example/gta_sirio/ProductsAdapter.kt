package com.example.gta_sirio

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gta_sirio.model.Product
import com.squareup.picasso.Picasso

class ProductsAdapter(private val products: ArrayList<Product>) : RecyclerView.Adapter<ProductsAdapter.ViewHolder>(){

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        Picasso.get().load(products[position].pictureUrl).into(holder.picture)
        holder.productName.text = products[position].title
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_search, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = products.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val picture: ImageView = itemView.findViewById(R.id.picture)

        val productName: TextView = itemView.findViewById(R.id.productName)

    }


}
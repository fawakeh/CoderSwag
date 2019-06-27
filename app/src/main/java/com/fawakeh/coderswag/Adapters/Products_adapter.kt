package com.fawakeh.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fawakeh.coderswag.Model.Product
import com.fawakeh.coderswag.R

class Products_adapter(val context: Context, val products: List<Product>, val itemClick: (Product) -> Unit) : RecyclerView.Adapter<Products_adapter.ProductHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
       val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent,false)
        return ProductHolder(view, itemClick)
    }

    override fun getItemCount(): Int {
    return products.count()
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder?.bindProduct(products[position], context)
    }

    inner class ProductHolder(itemView: View, val itemClick: (Product) -> Unit) : RecyclerView.ViewHolder(itemView){
        val productImage = itemView?.findViewById<ImageView>(R.id.productImage)
        val productName = itemView?.findViewById<TextView>(R.id.productName)
        val productPrice = itemView?.findViewById<TextView>(R.id.productPrice)
        val productDescription = itemView?.findViewById<TextView>(R.id.productDescription)


        fun bindProduct(product: Product, context: Context){
            val resourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productImage?.setImageResource(resourceId)
            productName?.text = product.title
            productPrice?.text = product.price
            productDescription?.text = product.description
            itemView.setOnClickListener{itemClick(product)}
        }
    }
}
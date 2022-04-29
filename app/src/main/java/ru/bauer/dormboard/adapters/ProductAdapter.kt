package ru.bauer.dormboard.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import ru.bauer.dormboard.R

class ProductAdapter(private val layoutId:Int):RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    class ViewHolder(view:View):RecyclerView.ViewHolder(view){
        val productImage = view.findViewById<ImageView>(R.id.product_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(layoutId,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 5
    }

}
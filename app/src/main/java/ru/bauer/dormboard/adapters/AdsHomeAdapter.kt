package ru.bauer.dormboard.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.NavDirections
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import ru.bauer.dormboard.R
import ru.bauer.dormboard.fragments.HomeFragmentDirections
import ru.bauer.dormboard.models.Ads

class AdsHomeAdapter(
    private val layoutId:Int,
    private val adsList: List<Ads>):RecyclerView.Adapter<AdsHomeAdapter.ViewHolder>() {


    class ViewHolder(view:View):RecyclerView.ViewHolder(view){
        val productImage:ImageView=view.findViewById(R.id.product_image)
        val productName: TextView =view.findViewById(R.id.product_name)
        val productPrice: TextView =view.findViewById(R.id.product_price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(layoutId,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentAds = adsList[position]
        holder.productImage.setImageResource(currentAds.product.imageResourceId)
        holder.productName.text = currentAds.product.name
        holder.productPrice.text = currentAds.product.price.toString()+" руб."
        holder.productImage.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToFragmentBuyProduct(currentAds)

            holder.productImage.findNavController().navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return adsList.size
    }

}
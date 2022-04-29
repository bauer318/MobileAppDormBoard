package ru.bauer.dormboard.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.bauer.dormboard.R

class AdsAdapter(private val layoutId:Int):RecyclerView.Adapter<AdsAdapter.ViewHolder>() {

    class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        val adsContent = view.findViewById<TextView>(R.id.ads)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(layoutId,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 2
    }
}
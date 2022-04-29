package ru.bauer.dormboard.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import ru.bauer.dormboard.R
import ru.bauer.dormboard.adapters.AdsAdapter
import ru.bauer.dormboard.adapters.ProductAdapter

class HomeFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home,container,false)
        val verticalRecyclerView = view.findViewById<RecyclerView>(R.id.vertical_recyclerview_product)
        verticalRecyclerView.adapter=ProductAdapter(R.layout.home_product_item)
        val adsRecycleView = view.findViewById<RecyclerView>(R.id.ads_recyclerview)
        adsRecycleView.adapter=AdsAdapter(R.layout.home_ads_item)
        return view
    }
}
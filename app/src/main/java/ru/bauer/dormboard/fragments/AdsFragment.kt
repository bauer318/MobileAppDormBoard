package ru.bauer.dormboard.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import ru.bauer.dormboard.R
import ru.bauer.dormboard.adapters.AdsAdapter

class AdsFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home_adding_ads,container,false)
        val adsRecycleView = view.findViewById<RecyclerView>(R.id.ads_adding_recyclerview)
        adsRecycleView.adapter = AdsAdapter(R.layout.ads_item)

        return view
    }
}
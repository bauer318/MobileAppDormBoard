package ru.bauer.dormboard.fragments

import android.os.Bundle
import android.os.RecoverySystem
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import ru.bauer.dormboard.R
import ru.bauer.dormboard.adapters.FavoriteAdapter

class FavoriteFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_favorite,container,false)
        val favoriteRecyclerView = view.findViewById<RecyclerView>(R.id.vertical_recyclerview_product)
        favoriteRecyclerView.adapter = FavoriteAdapter(R.layout.favorite_product_item)
        return view
    }
}
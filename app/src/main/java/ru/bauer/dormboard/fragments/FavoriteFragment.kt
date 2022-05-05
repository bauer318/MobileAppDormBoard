package ru.bauer.dormboard.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import ru.bauer.dormboard.R
import ru.bauer.dormboard.adapters.FavoriteAdapter
import ru.bauer.dormboard.databinding.FragmentFavoriteBinding

class FavoriteFragment: Fragment() {
    private var _binding:FragmentFavoriteBinding?=null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_favorite,container,false)
        /*val favoriteRecyclerView = view.findViewById<RecyclerView>(R.id.vertical_recyclerview_product)
        favoriteRecyclerView.adapter = FavoriteAdapter(R.layout.favorite_ads_item)
        return view*/
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentFavoriteBinding.bind(view)
        _binding = binding
        val favoriteRecyclerView = binding.verticalRecyclerviewProduct
        favoriteRecyclerView.adapter = FavoriteAdapter(R.layout.favorite_ads_item)
    }
    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}
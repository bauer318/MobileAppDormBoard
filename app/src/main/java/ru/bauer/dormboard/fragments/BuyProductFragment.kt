package ru.bauer.dormboard.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import ru.bauer.dormboard.databinding.FragmentBuyProductBinding

class BuyProductFragment: Fragment() {
    private val args by navArgs<BuyProductFragmentArgs>()
    private var _binding : FragmentBuyProductBinding?=null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBuyProductBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var product = args.selectedAds.product
        var user = args.selectedAds.user
        var productContent = product.name+"\n"+product.price+"\n"+user.firstName+"\nКомната "+user.roomNumber+"\n"+args.selectedAds.date
        with(binding) {
            productImage.setImageResource(product.imageResourceId)
            textProductContent.text = productContent
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
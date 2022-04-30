package ru.bauer.dormboard.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import ru.bauer.dormboard.R
import ru.bauer.dormboard.adapters.StatementAdapter
import ru.bauer.dormboard.adapters.AdsHomeAdapter
import ru.bauer.dormboard.databinding.FragmentHomeBinding
import ru.bauer.dormboard.models.Ads
import ru.bauer.dormboard.models.Product
import ru.bauer.dormboard.models.Statement
import ru.bauer.dormboard.models.User

class HomeFragment: Fragment() {
    private var _binding:FragmentHomeBinding?=null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentHomeBinding.bind(view)
        _binding = binding
        //Ours models
        val userList= arrayListOf<User>()
        val productList = arrayListOf<Product>()
        val adsList = arrayListOf<Ads>()
        val statementList = arrayListOf<Statement>()
        userList.add(User("Жак","Кибамба",533))
        userList.add(User("Сельсон","Вунже",432))
        productList.add(Product("Стул для офиса",2780.00,R.drawable.chair))
        productList.add(Product("Сушилка для белья",2500.03,R.drawable.clothes_drying_rack))
        productList.add(Product("Стул для офиса",2500.00,R.drawable.chair))
        productList.add(Product("Утюг",3780.78,R.drawable.iron))
        adsList.add(Ads(userList[0],productList[0],"10.04.2022"))
        adsList.add(Ads(userList[1],productList[1],"25.03.2022"))
        adsList.add(Ads(userList[1],productList[2],"30.04.2022"))
        adsList.add(Ads(userList[0],productList[3],"24.04.2022"))
        adsList.add(Ads(userList[1],productList[2],"07.04.2022"))
        adsList.add(Ads(userList[0],productList[1],"10.04.2022"))
        statementList.add(Statement(userList[0],"Завтра горячой воды не будет","30.04.2022","16:57"))
        statementList.add(Statement(userList[0],"Ключ спортзала находится в комнате старосты первого этажа. Если что, идите туда.",
            "30.04.2022","16:57"))
        val verticalRecyclerView = binding.verticalRecyclerviewProduct
        verticalRecyclerView.adapter=AdsHomeAdapter(R.layout.home_ads_item,adsList)
        val adsRecycleView = binding.adsRecyclerview
        adsRecycleView.adapter=StatementAdapter(R.layout.home_statement_item,statementList)

    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}
package ru.bauer.dormboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.bauer.dormboard.fragments.AdsFragment
import ru.bauer.dormboard.fragments.FavoriteFragment
import ru.bauer.dormboard.fragments.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val transaction = supportFragmentManager.beginTransaction()
        //transaction.replace(R.id.home_frame_container,HomeFragment())
        //transaction.replace(R.id.home_frame_container,FavoriteFragment())
        transaction.replace(R.id.home_frame_container,AdsFragment())
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
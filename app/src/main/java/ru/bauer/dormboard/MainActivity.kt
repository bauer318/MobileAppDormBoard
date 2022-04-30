package ru.bauer.dormboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.bauer.dormboard.fragments.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val transaction = supportFragmentManager.beginTransaction()
        //transaction.replace(R.id.home_frame_container,HomeFragment())
        //transaction.replace(R.id.home_frame_container,FavoriteFragment())
        //transaction.replace(R.id.home_frame_container,AdsFragment())
        //transaction.replace(R.id.home_frame_container,MessageFragment())
        transaction.replace(R.id.home_frame_container,ChatFragment())
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
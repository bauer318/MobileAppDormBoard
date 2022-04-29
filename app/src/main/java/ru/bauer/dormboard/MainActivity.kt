package ru.bauer.dormboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.bauer.dormboard.fragments.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.home_frame_container,HomeFragment())
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
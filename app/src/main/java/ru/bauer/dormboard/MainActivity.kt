package ru.bauer.dormboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import ru.bauer.dormboard.fragments.*

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navHostFragment=supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        setupActionBarWithNavController(navController)
        findViewById<BottomNavigationView>(R.id.bottom_nav).setupWithNavController(navController)
        /*val transaction = supportFragmentManager.beginTransaction()
        //transaction.replace(R.id.home_frame_container,HomeFragment())
        //transaction.replace(R.id.home_frame_container,FavoriteFragment())
        //transaction.replace(R.id.home_frame_container,AdsFragment())
        //transaction.replace(R.id.home_frame_container,MessageFragment())
        //transaction.replace(R.id.home_frame_container,ChatFragment())
        transaction.addToBackStack(null)
        transaction.commit()*/
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}
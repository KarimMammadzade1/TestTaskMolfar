package com.rteam.testtaskmolfar

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navigationView= findViewById<BottomNavigationView>(R.id.navView)
        val navHostFragment =supportFragmentManager.findFragmentById(R.id.nav_host_container) as NavHostFragment
        val navController = navHostFragment.navController
        setBottomNavigation(navigationView,navController)
        setStatusBar()





    }

    private fun setBottomNavigation(navigationView: BottomNavigationView,navController: NavController) {

        navigationView.setOnNavigationItemSelectedListener {
            when(it.itemId)
            {
                R.id.navigation_subliminals->{
                    navController.navigate(R.id.homeFragment)
                    true
                }
                R.id.navigation_favorites->{
                    navController.navigate(R.id.favoritesFragment)
                    true
                }
                R.id.navigation_journal->{
                    navController.navigate(R.id.journalFragment)
                    true
                }
                else -> false

            }
        }
    }

    private fun setStatusBar() {

        window.apply {
            clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            statusBarColor = Color.WHITE
        }
    }
}
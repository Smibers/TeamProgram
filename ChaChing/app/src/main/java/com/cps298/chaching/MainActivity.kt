package com.cps298.chaching

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.cps298.chaching.ui.main.MainFragment
import com.cps298.chaching.ui.main.home.HomeFragment
import com.cps298.chaching.ui.main.profile.ProfileFragment
import com.cps298.chaching.ui.main.search.SearchFragment
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.main_activity)
        setContentView(R.layout.nav_controller)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        val navigationView: NavigationView = findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener { menuItem ->
            // Handle the navigation item selection
            true
        }

        navigationView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_home -> {
                    // Handle the home action
                    Log.d("MainActivity ", "Home button clicked on nav")

                    val newFragment = HomeFragment()
                    val transaction = supportFragmentManager.beginTransaction() //use supportFragmentManager instead of parentFragmentManager in MainActivity
                    transaction.replace(R.id.frameLayout, newFragment)
                    transaction.addToBackStack(null)
                    transaction.commit()

                }
                R.id.nav_search -> {
                    val newFragment = SearchFragment()
                    val transaction = supportFragmentManager.beginTransaction() //use supportFragmentManager instead of parentFragmentManager in MainActivity
                    transaction.replace(R.id.frameLayout, newFragment)
                    transaction.addToBackStack(null)
                    transaction.commit()
                }
                 R.id.nav_profile -> {
                    val newFragment = ProfileFragment()
                    val transaction = supportFragmentManager.beginTransaction() //use supportFragmentManager instead of parentFragmentManager in MainActivity
                    transaction.replace(R.id.frameLayout, newFragment)
                    transaction.addToBackStack(null)
                    transaction.commit()
                    // Handle the profile action
                }
            }


            drawerLayout.closeDrawer(GravityCompat.START) // Close drawer on item click
            true
        }




    }

//This should prevent backing into an empty fragment which was an issue I was having
    override fun onBackPressed() {

        if (supportFragmentManager.backStackEntryCount > 0) {
            val currentFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView2)

            if (currentFragment !is HomeFragment) {
                // If current fragment is not MainFragment2, replace it.
                val newFragment = HomeFragment()
                val transaction = supportFragmentManager.beginTransaction() //use supportFragmentManager instead of parentFragmentManager in MainActivity
                transaction.replace(R.id.frameLayout, newFragment)
                transaction.addToBackStack(null)
                transaction.commit()
            } else {
                // If it's MainFragment2, defer to the system default behavior.
                super.onBackPressed()
            }
        } else {
            // If the back stack is empty, this is the root. Exit the app.
            super.onBackPressed()
        }
    }








}
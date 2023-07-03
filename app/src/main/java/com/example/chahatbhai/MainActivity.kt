package com.example.chahatbhai

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.chahatbhai.R
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity()
{

  private lateinit var navigationView: NavigationView
  private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar:Toolbar=findViewById(R.id.toolBar)
        this.setSupportActionBar(toolbar)

        val drawerLayout:DrawerLayout=findViewById(R.id.drawer_layout)
        navigationView=findViewById(R.id.nav_view)
        val navController= findNavController(R.id.nav_host_fragment)

        appBarConfiguration= AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_message, R.id.nav_news
            ),drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navigationView.setupWithNavController(navController)

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.nav_menu,menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController=findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}


package soumyajit.playground.com.navigationcomponentsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var host : NavHostFragment
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)


        host = supportFragmentManager
            .findFragmentById(R.id.my_nav_host_fragment) as NavHostFragment? ?: return

        navController = host.navController

        setUpBottomNav(navController)
    }


    private fun setUpBottomNav(navController: NavController) {
        val bottomNav  = findViewById<BottomNavigationView>(R.id.bottom_navigation_view)
        bottomNav?.setupWithNavController(navController)
    }
}

package com.empresa.tragos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.empresa.tragos.data.DataSource
import com.empresa.tragos.domain.RepoImpl
import com.empresa.tragos.ui.viewmodel.MainViewModel
import com.empresa.tragos.ui.viewmodel.VMFactory

/**
 * Created by Norman Sánchez on 18/10/20.
 */
class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var navHostFragment: NavHostFragment

    // ViewModel
    private val viewModel by viewModels<MainViewModel>{ VMFactory(RepoImpl(DataSource()))}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Este navController nos ayuda a ver las navegaciones
        navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        // Con esto el navController sabe que tiene hijos y un stack de los fragments
        NavigationUI.setupActionBarWithNavController(this, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp()
    }
}
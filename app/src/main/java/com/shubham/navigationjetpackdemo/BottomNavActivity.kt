package com.shubham.navigationjetpackdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_bottom_nav.*

class BottomNavActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_nav)

        supportActionBar?.title="Bottom Navigation"

        bottom_nav.setupWithNavController(findNavController(R.id.bottom_nav_host_fragment))
    }
}

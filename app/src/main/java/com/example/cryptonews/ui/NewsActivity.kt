package com.example.cryptonews.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.cryptonews.R
import com.example.cryptonews.databinding.ActivityNewsBinding

class NewsActivity : AppCompatActivity() {

        private lateinit var binding: ActivityNewsBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val navController = findNavController(R.id.newsNavHostFragment)

        binding.bottomNavigationView.setupWithNavController(navController)




    }


}
package com.akirachix.dishhub

//import HomeFragment
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.fragment.app.Fragment
import com.akirachix.dishhub.databinding.ActivityCategoriesBinding

class Categories : AppCompatActivity() {
    private lateinit var binding: ActivityCategoriesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoriesBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    loadFragment(HomeFragment())
                    true
                }
//                R.id.recipe -> {
//                    loadFragment(RecipesFragment())
//                    true
//                }
                R.id.pantry -> {
                    // Assuming PantryFragment does not require parameters, instantiate it directly
                    loadFragment(PantryFragment())
                    true
                }
                R.id.shop -> {
                    loadFragment(ShopFragment())
                    true
                }
                else -> true
            }
        }

        if (savedInstanceState == null) {
            loadFragment(HomeFragment())
            binding.bottomNavigationView.selectedItemId = R.id.home
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fcvHome, fragment).commit()
    }

}






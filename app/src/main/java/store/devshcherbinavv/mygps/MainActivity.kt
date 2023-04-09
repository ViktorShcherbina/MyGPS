package store.devshcherbinavv.mygps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import store.devshcherbinavv.mygps.databinding.ActivityMainBinding
import store.devshcherbinavv.mygps.fragments.MainFragment
import store.devshcherbinavv.mygps.fragments.SettingsFragment
import store.devshcherbinavv.mygps.fragments.TracksFragment
import store.devshcherbinavv.mygps.utils.openFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onButtonNavClick()
        openFragment(MainFragment.newInstance())
    }
    private fun onButtonNavClick() {
        binding.bNan.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.id_home -> openFragment(MainFragment.newInstance())
                R.id.id_tracks -> openFragment(TracksFragment.newInstance())
                R.id.id_settings -> openFragment(SettingsFragment())
            }
            true
        }


    }
}
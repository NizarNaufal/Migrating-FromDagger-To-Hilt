package id.migratingdagger.hilt.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import id.migratingdagger.hilt.R
import id.migratingdagger.hilt.ui.list.NewsListFragment

@AndroidEntryPoint // HERE
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.anchor, NewsListFragment())
                .commit()
        }
    }
}
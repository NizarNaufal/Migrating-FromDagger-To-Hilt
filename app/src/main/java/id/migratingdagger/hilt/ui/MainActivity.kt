package id.migratingdagger.hilt.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.migratingdagger.hilt.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
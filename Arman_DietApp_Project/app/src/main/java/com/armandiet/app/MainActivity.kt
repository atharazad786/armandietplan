
package com.armandiet.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSeed = findViewById<Button>(R.id.btnSeed)
        btnSeed.setOnClickListener {
            lifecycleScope.launch {
                withContext(Dispatchers.IO) {
                    DataSeeder.seed(applicationContext)
                }
                Toast.makeText(this@MainActivity, "Seeded meals into DB", Toast.LENGTH_LONG).show()
            }
        }
    }
}

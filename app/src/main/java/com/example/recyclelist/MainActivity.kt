package com.example.recyclelist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Shop by Category"
    }

    private fun alert(text: String) {
        Toast.makeText(
            applicationContext,
            "You have chosen the $text category of shopping",
            Toast.LENGTH_SHORT
        ).show()
    }

    fun onClick(v: View?) {
        var recycleIntent = Intent(this, RecyclerViewActivity::class.java);
        when (v?.id) {
            R.id.electronic -> startActivity(recycleIntent)
            R.id.clothing -> alert(getString(R.string.str_clothes))
            R.id.beauty -> alert(getString(R.string.str_beauty))
            R.id.food -> alert(getString(R.string.str_food))
            else -> alert("Nothing")
        }
    }
}
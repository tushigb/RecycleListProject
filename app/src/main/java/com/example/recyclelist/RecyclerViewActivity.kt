package com.example.recyclelist

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity(), ListAdapter.ItemClickListener {

    private val products = ArrayList<Product>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        supportActionBar?.title = "Electronics Category"

        products.add(
            Product(
                "Macbook Air M1",
                999.00,
                "Space Gray",
                R.drawable.macbook_airm1,
                "#0000001",
                "8-Core CPU\n" +
                        "7-Core GPU\n" +
                        "8GB Unified Memory\n" +
                        "256GB SSD Storage¹"
            )
        )
        products.add(
            Product(
                "Macbook Air M2",
                1199.00,
                "Midnight",
                R.drawable.macbook_airm2,
                "#0000002",
                "8-Core CPU\n" +
                        "8-Core GPU\n" +
                        "8GB Unified Memory\n" +
                        "256GB SSD Storage¹"
            )
        )
        products.add(
            Product(
                "Macbook Pro M2",
                1300.00,
                "Space Gray",
                R.drawable.macbook_prom2,
                "#0000003",
                "8-Core CPU\n" +
                        "10-Core GPU\n" +
                        "8GB Unified Memory\n" +
                        "256GB SSD Storage¹"
            )
        )
        products.add(
            Product(
                "Macbook Pro M1 Pro",
                1999.00,
                "Space Gray",
                R.drawable.macbook_prom1pro,
                "#0000004",
                "8-Core CPU\n" +
                        "14-Core GPU\n" +
                        "16GB Unified Memory\n" +
                        "512GB SSD Storage¹\n"
            )
        )
        products.add(
            Product(
                "Airpods (3rd generation)",
                169.00,
                "White",
                R.drawable.airpods_3rdgen,
                "#0000005",
                "Personalized Spatial Audio with dynamic head trackingᴼ\n" +
                        "Sweat and water resistant AirPods and charging caseᴼᴼ\n" +
                        "Up to 6 hours of listening time with a single chargeᴼᴼᴼ\n" +
                        "Lightning Charging Case or MagSafe Charging Case"
            )
        )
        products.add(
            Product(
                "Airpods Pro (2nd generation)",
                249.00,
                "White",
                R.drawable.airpods_pro2ndgen,
                "#0000006",
                "Personalized Spatial Audio with dynamic head trackingᴼ\n" +
                        "Active Noise Cancellation and Adaptive Transparency\n" +
                        "Sweat and water resistant AirPods and charging caseᴼᴼ\n" +
                        "Up to 6 hours of listening time with a single chargeᴼᴼᴼ\n" +
                        "MagSafe Charging Case with speaker and lanyard loop˄"
            )
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = ListAdapter(products, this)
        recyclerView.adapter = adapter

    }

    override fun onItemClick(position: Int) {
        val detailIntent = Intent(applicationContext, ProductDetail::class.java)
        detailIntent.putExtra("PRODUCT", products[position])
        startActivity(detailIntent)
    }

}
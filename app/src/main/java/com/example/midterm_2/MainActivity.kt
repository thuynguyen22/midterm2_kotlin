package com.example.midterm_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    val cardImage: IntArray = intArrayOf(
        R.drawable.hinh_1,
        R.drawable.hinh_2,
        R.drawable.hinh_3,
        R.drawable.hinh_4,
        R.drawable.hinh_5,
        R.drawable.hinh_6
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listview = findViewById<ListView>(R.id.rvFoodItems)

        var listFood: ArrayList<Food> = ArrayList()
        listFood.add(Food("Mon an 1", R.drawable.hinh_1))
        listFood.add(Food("Mon an 2", R.drawable.hinh_2))
        listFood.add(Food("Mon an 3", R.drawable.hinh_3))
        listFood.add(Food("Mon an 4", R.drawable.hinh_4))
        listFood.add(Food("Mon an 5", R.drawable.hinh_5))
        listFood.add(Food("Mon an 6", R.drawable.hinh_6))

        listview.adapter = FoodAdapter(this, listFood)
        val btnRandom = findViewById<Button>(R.id.btnRandom)
        val imageview = findViewById<ImageView>(R.id.rdFoodImage)
                btnRandom.setOnClickListener {
                    var random = Random
                    var image = random.nextInt(cardImage.size)
                    imageview.setImageResource(cardImage[image])
        }
   }

    }





package com.example.assignment04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment04.ImageItem
import com.example.assignment04.R
import com.example.assignment04.ImageAdapter

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        val displayImageView = findViewById<ImageView>(R.id.displayImageView)
        val nameTextView = findViewById<TextView>(R.id.nameTextView)

        val images = arrayOf(
            ImageItem(R.drawable.android_01, "Lake"),
            ImageItem(R.drawable.android_02, "Daisies"),
            ImageItem(R.drawable.android_03, "Car light"),
            ImageItem(R.drawable.android_04, "RV trailer"),
            ImageItem(R.drawable.android_05, "Seaside road"),
            ImageItem(R.drawable.android_06, "Autumn leaves"),
            ImageItem(R.drawable.android_07, "Colorful houses"),
            ImageItem(R.drawable.android_08, "Road"),
            ImageItem(R.drawable.android_09, "Sunset"),
            ImageItem(R.drawable.android_10, "Grass")

        )

        val callback = {item : ImageItem ->
            displayImageView.setImageResource(item.id)
            nameTextView.text = item.name
        }
        recyclerView.adapter = ImageAdapter(images, callback)


        //recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
    }
}
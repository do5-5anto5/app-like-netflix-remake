package com.do55anto5.netflixremake

import android.graphics.drawable.LayerDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class MovieActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)

        val toolbar: Toolbar = findViewById(R.id.toolbar_movie)
        setSupportActionBar(toolbar)

        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //get the drawable
        val layerDrawable: LayerDrawable = ContextCompat.getDrawable(this, R.drawable.shadows) as LayerDrawable

        //get the relative image
        val movieCover = ContextCompat.getDrawable(this, R.drawable.movie_4)

        //set the relative image to layer-list
        layerDrawable.setDrawableByLayerId(R.id.cover_drawable, movieCover)

        //set ImageView
        val coverImg: ImageView = findViewById(R.id.img_movie)
        coverImg.setImageDrawable(layerDrawable)
    }
}
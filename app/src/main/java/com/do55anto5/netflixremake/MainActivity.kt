package com.do55anto5.netflixremake

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.do55anto5.netflixremake.model.Movie

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movies = mutableListOf<Movie>()
        for(i in 0 until 5){
            val movie = Movie(R.drawable.movie)
            movies.add(movie)

        val rv: RecyclerView = findViewById(R.id.rv_main)
        val adapter = MainAdapter(movies)
        rv.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        rv.adapter = adapter
        }
    }
}
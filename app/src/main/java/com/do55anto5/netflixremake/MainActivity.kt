package com.do55anto5.netflixremake

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.do55anto5.netflixremake.model.Category
import com.do55anto5.netflixremake.model.Movie

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val categories = mutableListOf<Category>()

        for (i in 0 until 10) {
            val movies = mutableListOf<Movie>()
            for (j in 0 until 15) {
                val movie = Movie(R.drawable.movie)
                movies.add(movie)
            }
            val category = Category("category $i", movies)
            categories.add(category)
        }

        //in vertical recycler view has a list (MainAdapter) of categories
        //each category inner item (category)[TextView+RVh]
        //has a list(MovieAdapter) of movies

        val rv: RecyclerView = findViewById(R.id.rv_main)
        val adapter = CategoryAdapter(categories)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = adapter
    }
}
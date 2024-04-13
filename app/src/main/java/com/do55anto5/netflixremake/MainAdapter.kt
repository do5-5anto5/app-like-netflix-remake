package com.do55anto5.netflixremake

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.do55anto5.netflixremake.model.Movie

class MainAdapter(private val movies: List<Movie>): RecyclerView.Adapter<MainAdapter.MovieVilHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieVilHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
        return MovieVilHolder(view)
    }

    override fun onBindViewHolder(holder: MovieVilHolder, position: Int) {
        val movie = movies[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    inner class MovieVilHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(movie: Movie) {
            val imageCover: ImageView = itemView.findViewById(R.id.img_cover)
            imageCover.setImageResource(movie.coverUrl)
        }
    }

}
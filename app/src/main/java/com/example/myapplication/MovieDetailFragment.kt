package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide

class MovieDetailFragment : Fragment(R.layout.fragment_movie_detail) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val movie: Movie = MovieDetailFragmentArgs.fromBundle(requireArguments()).movie

        val titleTextView: TextView = view.findViewById(R.id.titleTextView)
        val directorTextView: TextView = view.findViewById(R.id.directorTextView)
        val descriptionTextView: TextView = view.findViewById(R.id.descriptionTextView)
        val imageView: ImageView = view.findViewById(R.id.imageView)

        titleTextView.text = movie.title
        directorTextView.text = movie.director
        descriptionTextView.text = movie.description
        Glide.with(requireContext())
            .load(movie.imageUrl)
            .into(imageView)
    }
}
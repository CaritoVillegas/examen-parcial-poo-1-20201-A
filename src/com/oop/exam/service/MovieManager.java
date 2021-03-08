package com.oop.exam.service;

import com.oop.exam.model.Movie;
import com.oop.exam.model.Review;

import java.util.LinkedList;

public class MovieManager {
    private LinkedList<Movie> movies;

    public MovieManager() {
        this.movies = new LinkedList<>();
    }

    public LinkedList<Movie> getMovies() {
        return movies;
    }

    public Movie findMovie(String name) {
       return ();
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }
}

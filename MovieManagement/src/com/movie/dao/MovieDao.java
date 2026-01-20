package com.movie.dao;

import com.movie.beans.Movie;

public interface MovieDao {

	Boolean addMovie(Movie movie);

	boolean removeById(int id);

	void displayByType(String type);

}

package com.movie.service;

public interface MovieService {

	Boolean addMovie();

	boolean deleteMovie(int id);

	void displayByType(String type);

}

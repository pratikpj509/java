package com.movie.dao;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.movie.beans.BollywoodMovie;
import com.movie.beans.Movie;
import com.movie.beans.ShortMovie;

public class MovieDaoImpl implements MovieDao {
	
	
	 static  Set<Movie> movieSet;
	   static {
		   movieSet=new HashSet<>();
		   movieSet.add(new ShortMovie(
	                101, "Silent Tears", 25,
	                "Aman Verma", "Riya Singh",
	                LocalDate.of(2023, 5, 10),
	                "Social Awareness"
	        ));

	        movieSet.add(new ShortMovie(
	                102, "The Last Call", 30,
	                "Rahul Mehta", "Sneha Patil",
	                LocalDate.of(2022, 8, 18),
	                "Mental Health"
	        ));
		   
	        movieSet.add(new BollywoodMovie(
	                201, "Dil Se Zindagi", 150,
	                "Ranveer Kapoor", "Ananya Sharma",
	                LocalDate.of(2021, 11, 5),
	                6, "Arijit Singh"
	        ));

	        movieSet.add(new BollywoodMovie(
	                202, "Safar", 165,
	                "Akshay Malhotra", "Kriti Joshi",
	                LocalDate.of(2020, 3, 20),
	                8, "Shreya Ghoshal"
	        ));
	   }

	@Override
	public Boolean addMovie(Movie movie) {
		
		 return movieSet.add(movie);
	}


	@Override
	 public boolean removeById(int id) {
		 return movieSet.removeIf(m -> m.getMovieId() == id);
	 }
	
	 public void displayByType(String type) {
	        for (Movie m : movieSet) {
	            if (m.getType().equalsIgnoreCase(type)) {
	                System.out.println(m);
	            }
	        }
	    }

	 

}

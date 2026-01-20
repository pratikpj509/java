package com.movie.service;

import java.time.LocalDate;
import java.util.Scanner;

import com.movie.beans.BollywoodMovie;
import com.movie.beans.Movie;
import com.movie.beans.ShortMovie;
import com.movie.dao.MovieDao;
import com.movie.dao.MovieDaoImpl;

public class MovieServiceImpl implements MovieService  {


	 MovieDao dao;
	 Scanner sc = new Scanner(System.in);
	 
	 

	public MovieServiceImpl() {
		super();
		this.dao = new MovieDaoImpl();
	}

	@Override
	public Boolean addMovie() {
	    Scanner sc = new Scanner(System.in);
		
	       System.out.println("1.Short Movie  2.Bollywood Movie");
	        int type = sc.nextInt();

	        System.out.print("Movie ID: ");
	        int id = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Movie Name: ");
	        String name = sc.nextLine();

	        System.out.print("Duration: ");
	        int duration = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Actor: ");
	        String actor = sc.nextLine();

	        System.out.print("Actress: ");
	        String actress = sc.nextLine();

	        LocalDate date = LocalDate.now();
	        Movie movie = null;

	        if (type == 1) {
	            System.out.print("Topic: ");
	            String topic = sc.nextLine();
	            movie = new ShortMovie(id, name, duration, actor, actress, date, topic);
	        } 
	        else if (type == 2) {
	            System.out.print("No of Songs: ");
	            int songs = sc.nextInt();
	            sc.nextLine();

	            System.out.print("Singer: ");
	            String singer = sc.nextLine();
	            movie = new BollywoodMovie(id, name, duration, actor, actress, date, songs, singer);
	        }

		return dao.addMovie(movie);
	}

	@Override
	public boolean deleteMovie(int id) {
		  
        return dao.removeById(id);
		
	}

	@Override
	public void displayByType(String type) {
		
		dao.displayByType(type);
		
	}
	
	

	
	

}

package com.movie.test;

import java.util.Scanner;

import com.movie.service.MovieService;
import com.movie.service.MovieServiceImpl;

public class MovieTest {
	public static void main(String[] args) {

		MovieService service= new MovieServiceImpl();
		 
		Scanner sc = new Scanner(System.in);
		int choice=0;
		 
		 do {
	         System.out.println("\n1.Add Movie");
	         System.out.println("2.Delete Movie");
	         System.out.println("3.Display Movies by Type");
	         System.out.println("4.Exit");
	         System.out.print("Enter choice: ");
	         choice = sc.nextInt();

	         switch (choice) {
	             case 1:
	            	 
	            	 boolean status =service.addMovie();
	            	 if (status) {
	                     System.out.println("Movie added successfully");
	                 } else {
	                     System.out.println("Movie with same ID already exists");
	                 }
	                 
	                 break;

	             case 2:
	                 
	                 System.out.print("Enter Movie ID to delete: ");
	                 int id = sc.nextInt();
	                 boolean delete=service.deleteMovie(id);

	                 if (delete) {
	                     System.out.println("Movie deleted successfully");
	                 } else {
	                     System.out.println("Movie not found");
	                 }
	                 break;

	             case 3:
	                 
	                 System.out.print("Enter Type (ShortMovie/BollywoodMovie): ");
	                 sc.nextLine();
	                 String type = sc.nextLine();
	                 
	                 service.displayByType(type);
	                 
	                 break;

	             case 4:
	                 System.out.println("Exit...");
	         }
	     } while (choice != 4);

	     sc.close();
		
	}

}

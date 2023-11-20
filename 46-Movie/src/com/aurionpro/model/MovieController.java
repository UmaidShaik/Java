package com.aurionpro.model;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;


public class MovieController {
	
	private MovieManager manager;
	
	public MovieController() {
		manager = new MovieManager();
	}

	public void start() {
		List<Movie> allmovies = manager.movies;  //[1,2]
		System.out.println(allmovies);
		
		String chosedOption = displayMenu();   //1
		Scanner sc = new Scanner(System.in);
		
		int id;
		String name;
		int year;
		String genre;
		
		switch (chosedOption) {
		case "1":
			System.out.print("Enter Id: ");
			id=sc.nextInt();
			System.out.print("Enter name: ");
			name = sc.next();
			System.out.println("Enter year: ");
			year = sc.nextInt();
			System.out.println("Enter genre: ");
			genre = sc.next();
			Movie movie = new Movie(id, name, year, genre);
			manager.addMovie(movie);		
			manager.saveMovies();
			
			break;
		case "2":
			System.out.println("Enter the movie Id to delete");
			id = sc.nextInt();
			manager.deleteMovie(id);
			manager.saveMovies();
			break;
		case "3":
			manager.clearMovies();
			manager.saveMovies();
			break;
		case "4":
			System.out.println("Enter the movie id");
			id = sc.nextInt();
			manager.getMovieByID(id);
//			manager.saveMovies();
			break;
		default:
			System.out.println("Invalid");
		}
		
	}
	
	private String displayMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. addMovie");
		System.out.println("2. deleteMovie");
		System.out.println("3. deleteAllMovies");
		System.out.println("4. getMovieByID");
		System.out.println("Choose from menu: ");
		
		String chosedOption = sc.next();   
		return chosedOption;    //1
	}

}

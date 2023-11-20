package com.aurionpro.model;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieManager {

	List<Movie> movies;

	public MovieManager() {
		 movies = new ArrayList<>();

		 movies = loadMovies();  //[1,2,3]
//		if (movies == null) {
//			movies = new ArrayList<>();
//		}
	}

	public void addMovie(Movie movie) {  
		movies.add(movie);
//		System.out.println(movies);
	}

	public void deleteMovie(int ID) {
		for (Movie movie : movies) {
			if (movie.getId() == ID) {
				movies.remove(movie);
				break;
			}
		}
		System.out.println(movies);
	}

	public void clearMovies() {
		movies.clear();
		System.out.println(movies);
	}

	public void getMovieByID(int ID) {
		for (Movie movie : movies) {
			if (movie.getId() == ID) {
				System.out.println(movie);
				break;
			}
		}
	}

	public List loadMovies() {
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\umaid.shaikh\\Desktop\\serailize\\Movies.txt");

//			int b = file.available();
//			if (b != 0) {
				ObjectInputStream in = new ObjectInputStream(file);

				List<Movie> allmovies = (List<Movie>) in.readObject();
				in.close();
//			}

			file.close();
			return allmovies;

//			System.out.println(account.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void saveMovies() {
		try {
			FileOutputStream file = new FileOutputStream("C:\\Users\\umaid.shaikh\\Desktop\\serailize\\Movies.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(movies);
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

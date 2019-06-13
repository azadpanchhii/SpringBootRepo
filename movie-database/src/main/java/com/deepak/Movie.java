package com.deepak;

public class Movie {
	private String name;
	private String movieId;
	public Movie()
	{
		System.out.println("Default movie constructor.");
	}
	public Movie(String name, String movieId) {
		super();
		this.name = name;
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	
}

package com.deepak;

public class MovieItem {
	private String movieName;
	private String movieDesc;
	private int rating;
	
	public MovieItem()
	{
		System.out.println("Default Constructor");
	}
	public MovieItem(String movieName, String movieDesc, int rating) {
		super();
		this.movieName = movieName;
		this.movieDesc = movieDesc;
		this.rating = rating;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieDesc() {
		return movieDesc;
	}
	public void setMovieDesc(String movieDesc) {
		this.movieDesc = movieDesc;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
}

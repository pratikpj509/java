package com.movie.beans;

import java.time.LocalDate;

public class BollywoodMovie extends Movie {
	private int noOfSongs;
    private String singer;
	public BollywoodMovie(int movieId, String mname, int duration, String actor, String actress, LocalDate releaseDate,
			int noOfSongs, String singer) {
		super(movieId, mname, duration, actor, actress, releaseDate);
		this.noOfSongs = noOfSongs;
		this.singer = singer;
	}
	
	
	
	public int getNoOfSongs() {
		return noOfSongs;
	}



	public void setNoOfSongs(int noOfSongs) {
		this.noOfSongs = noOfSongs;
	}



	public String getSinger() {
		return singer;
	}



	public void setSinger(String singer) {
		this.singer = singer;
	}



	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "BollywoodMovie";
	}



	@Override
	public String toString() {
		return "BollywoodMovie [noOfSongs=" + noOfSongs + ", singer=" + singer + ", movieId=" + movieId + ", mname="
				+ mname + ", duration=" + duration + ", actor=" + actor + ", actress=" + actress + ", releaseDate="
				+ releaseDate + "]";
	}
	
    
    
    
	
    
	
    
    
    
}

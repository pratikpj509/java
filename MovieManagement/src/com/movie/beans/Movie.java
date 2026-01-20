package com.movie.beans;

import java.time.LocalDate;

public abstract class Movie {
	protected int movieId;
    protected String mname;
    protected int duration;
    protected String actor;
    protected String actress;
    protected LocalDate releaseDate;
    
	public Movie(int movieId, String mname, int duration, String actor, String actress, LocalDate releaseDate) {
		super();
		this.movieId = movieId;
		this.mname = mname;
		this.duration = duration;
		this.actor = actor;
		this.actress = actress;
		this.releaseDate = releaseDate;
	}
	

	


	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getActress() {
		return actress;
	}

	public void setActress(String actress) {
		this.actress = actress;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
    
	public abstract String getType();

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", mname=" + mname + ", duration=" + duration + ", actor=" + actor
				+ ", actress=" + actress + ", releaseDate=" + releaseDate + "]";
	}
	
	

    

}

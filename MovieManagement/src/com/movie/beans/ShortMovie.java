package com.movie.beans;

import java.time.LocalDate;

public class ShortMovie extends Movie {
	
	 
	 private String topic;

	 public ShortMovie(int movieId, String mname, int duration, String actor, String actress, LocalDate releaseDate,
			String topic) {
		super(movieId, mname, duration, actor, actress, releaseDate);
		this.topic = topic;
	 }

	 public String getTopic() {
		 return topic;
	 }

	 public void setTopic(String topic) {
		 this.topic = topic;
	 }
	 
	 @Override
	 public String getType() {
		// TODO Auto-generated method stub
		return "ShortMovie";
	 }

	 @Override
	 public String toString() {
		return "ShortMovie [topic=" + topic + ", toString()=" + super.toString() + "]";
	 }

	

	
	
	 
	    
}

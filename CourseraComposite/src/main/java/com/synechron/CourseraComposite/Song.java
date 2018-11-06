package com.synechron.CourseraComposite;

public class Song implements IComponent{
	public String songName;
	public String artist;
	public float speed = 1; // Default playback speed

	public Song(String songName, String artist ) {
		this.songName = songName;
		this.artist = artist; 
	}

	public void play() {
		// playing song
		System.out.println(songName+" is playing");
	}

	public void setPlayBackSpeed(float speed) {
		this.speed = speed;
	}

	public String getName() {
		
		return songName;
	}
	
	public String getArtist() {
		
		return artist;
	}
	

}

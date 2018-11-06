package com.synechron.CourseraComposite;

import java.util.ArrayList;

public class Playlist implements IComponent{

	public String playlistName;
	public ArrayList<IComponent> playlist = new ArrayList<>();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}
	
	public void play() {
		for(IComponent playElement:playlist){
			if(playElement instanceof Playlist)
			{
				((Playlist)playElement).play();
			}
			else
				((Song)playElement).play();
		}
	}
		
	

	public void setPlayBackSpeed(float speed) {
		for(IComponent playElement:playlist){
			if(playElement instanceof Playlist)
			{
				((Playlist)playElement).setPlayBackSpeed(speed);
			}
			else
				((Song)playElement).setPlayBackSpeed(speed);
		}
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return playlistName;
	}
	
	public void add(IComponent component)
	{
		playlist.add(component);
	}
	
	public void remove(IComponent component)
	{
		playlist.remove(component);
	}

	
	
	

}

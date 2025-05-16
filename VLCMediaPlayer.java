package com.nit.Interfaces;

import java.util.LinkedHashSet;

class Song
{
	private String songName;
	private String singerName;
	private String type;
}
interface MediaPlayer
{
	void play();
	void pause();
	void stop();
}
interface AdvancedMediaPlayer extends MediaPlayer
{
	void adjustVolume(int volumeLevel);
	void skippingTrack();
}
interface PlaylistMediaPlayer extends AdvancedMediaPlayer
{
	void createplaylists(String playListName,LinkedHashSet<Song> s);
	void addingplaylists();
}
class VLCMediaPlayer  implements PlaylistMediaPlayer{
	
	private String playListName;
	LinkedHashSet<Song> PlayList;
	public void play()
	{
		System.out.println("Video played");
	}
	public void pause()
	{
		System.out.println("video paused");
	}
	public void stop()
	{
		System.out.println("video stopped");
	}
	public void adjustVolume(int volumeLevel)
	{
		if(volumeLevel<1)
		{
			System.out.println("mute");
		}
		else if(volumeLevel>=1 && volumeLevel<=20)
		{
			System.out.println("low volume");
		}
		else if(volumeLevel>=21 && volumeLevel<=30)
		{
			System.out.println("Medium volume");
		}
		else if(volumeLevel>=31 && volumeLevel<=40)
		{
			System.out.println("High Volume");
		}
	}
	public void skippingTrack()
	{
		System.out.println("video tracked");
	}
	
	public void createplaylists(String playListName,LinkedHashSet<Song> s)
	{
		if(this.playListName.equals(null))
		{
			this.playListName=playListName;
			System.out.println(playListName+"created");
		}
	}
	public void addingplaylists()
	{
		System.out.println("Adding PlayLists");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VLCMediaPlayer vlc=new VLCMediaPlayer();
		vlc.play();
		vlc.pause();
		vlc.stop();
		
		
	}

}

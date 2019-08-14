
import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
		
	private String albumName;
	private String artist;
	private SongList songs;
	 		
	public Album(String albumName, String artist) {
		this.albumName = albumName;
		this.artist = artist;
    	this.songs = new SongList();
	}
	
	
	public ArrayList<Song> getSongs() {
		return songs.getSongs();
	}


	public boolean addSong(String title, double duration){
		return this.songs.addSong(new Song(title,duration));	   		
	}

	public boolean addToPlayList(String title,LinkedList<Song> playList) {
		Song existingSong = this.songs.findSong(title);
		if(existingSong != null) {
			playList.add(existingSong);
			return true;
		}
		return false;	
	}
	
   public boolean addToPlayList(int trackNumber,LinkedList<Song> playList) {
	   Song existingSong = this.songs.findSong(trackNumber);
	   if(existingSong != null) {
			playList.add(existingSong);
			return true;   
	   }
	return false;  
   }
    
	private class SongList{
		
		private ArrayList<Song>songs;
		
		public SongList() {
			this.songs = new ArrayList<Song>();
		}
		
		public ArrayList<Song> getSongs() {
			return this.songs;
		}

		private Song findSong(String title) {
			for (Song checkedSong : this.songs) {
				 if ( checkedSong.getTitle().equalsIgnoreCase(title)) {
					 return checkedSong;
				 }
			 }
			return null;  
		}
		
		private Song findSong(int trackNumber) {
		    int index = trackNumber-1;
			if (index >= 0 && index < songs.size()) {
				return songs.get(index);
				
			}
			return null;
		}
		
		public boolean addSong(Song song){
		if(this.songs.contains(song)) {
			return false;
		}
		this.songs.add(song);
		return true;	   		
	}	
  }

//
	
//	private Song findSong(String title) {
//		for (Song checkedSong : this.songs) {
//			 if ( checkedSong.getTitle().equalsIgnoreCase(title)) {
//				 return checkedSong;
//			 }
//		 }
//		return null;  
//	}
//	
	
	
}


public class iPod {
	private Song songs[];
	private int lastSong;
	//constructor

	public iPod(int size) {
	songs= new Song [size];
	lastSong=-1;
	
	
		
	}

	
	
	
	
	//Getters and setters(maybe)
	
	// toString
	
	//Print out each song of a genre
	//Print out all songs
	//Print out top 10 most popular songs
	//Play a song (add 1 to number of times played)
	//Print a list of all songs by artist
	//Print out a list of top 10 longest/shortest songs
	//Randomly pick a song to "listen" to (once you pick to you play it?)
	//add a song to a specific list (Whole song list or genre?)
public void addSong(Song song)
{
	lastSong +=1;
	songs[lastSong]= song;  	
}
	//remove a song from a given list (Whole song list or genre?)
	//print out all song on a given album
	

}

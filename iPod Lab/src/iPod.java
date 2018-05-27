import java.util.Arrays;

public class iPod {
	private Song[] songs;
	private int lastSong;
	//constructor

	public iPod(int size) {
	songs= new Song [size];
	lastSong=0;
	}

	
	//Getters and setters(maybe)
	
	// toString
	public String toString() {
		String eol = System.getProperty("line.separator");
		String iPod = "iPod [ ";
		for(int i=0; i<lastSong; i++)
		{if(i!=0)
		{
			iPod= iPod+"       ";
		}
			iPod = iPod + songs[i].toString()+ eol;
		}
		return iPod;
	}
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
	
	songs[lastSong]= song; 
	lastSong +=1;
}
	//remove a song from a given list (Whole song list or genre?)
	//print out all song on a given album






	

}

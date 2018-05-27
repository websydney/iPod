import java.util.Arrays;

public class iPod {
	private Song[] songs;
	private int numSongs;
	//constructor

	public iPod(int size) {
	
		if (size > 0) {
		initializeSongsDynamic(size);
		}
		else {
			initializeSongsStatic();
		}
	}

	
	//Getters and setters(maybe)
	
	// toString
	public String toString() {
		String eol = System.getProperty("line.separator");
		String iPod = "iPod [ ";
		for(int i=0; i<numSongs; i++)
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
	
	songs[numSongs]= song; 
	numSongs +=1;
}
	//remove a song from a given list (Whole song list or genre?)
	//print out all song on a given album



private void initializeSongsDynamic(int size)
{
	songs= new Song [size];
	numSongs=0;
}

private void initializeSongsStatic()
{
	 songs = new Song[] { new Song("The Last One You'd Expect","A Gentleman's Guide to Love and Murder Company","A Gentleman's Guide to Love and Murder (Original Broadway Cast Recording)",381,"Soundtrack"),
                          new Song("Blah1", "bob1", "bbbb1", 200, "gladk1")};
	 numSongs = songs.length;
}

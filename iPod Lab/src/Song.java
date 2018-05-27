
public class Song {
private String title;
private String artist;
private String album;
private int length;
private String genre;
private int timesPlayed;

//overloaded Constructor
public Song(String title, String artist, String album, int length, String genre) {
	this.title = title;
	this.artist = artist;
	this.album = album;
	this.length = length;
	this.genre = genre;
	this.timesPlayed = 0;
}

public Song() {
	// TODO Auto-generated constructor stub
}

//Getters and setters
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getArtist() {
	return artist;
}
public void setArtist(String artist) {
	this.artist = artist;
}
public String getAlbum() {
	return album;
}
public void setAlbum(String album) {
	this.album = album;
}
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public int getTimesPlayed() {
	return timesPlayed;
}
public void setTimesPlayed(int timesPlayed) {
	this.timesPlayed = timesPlayed;
}

//toString
@Override
public String toString() {
	return "song [title=" + title + ", artist=" + artist + ", album=" + album + ", length=" + length + ", genre="
			+ genre + ", timesPlayed=" + timesPlayed + "]";
}




}

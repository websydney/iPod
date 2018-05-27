
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an empty iPod
		iPod myiPod= new iPod(50);
		
		// Create a song and print it
		Song mySong= new Song("Blah", "bob", "bbbb", 100, "gladk");
		Song mySong2= new Song("Blah1", "bob1", "bbbb1", 200, "gladk1");
		System.out.println(mySong.toString());
		
		// Add your song to the iPod
		myiPod.addSong(mySong);
		myiPod.addSong(mySong2);
		System.out.println(myiPod.toString());
		

	}

}

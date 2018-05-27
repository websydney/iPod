
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test2();			
	}
	
	public static void test1() {
		// Create an empty iPod
		iPod myiPod= new iPod(50);
		
		System.out.println("Test1: song constructor and addSong");
		
		// Create a song and print it
		Song mySong= new Song("Blah", "bob", "bbbb", 100, "gladk");
    	Song mySong2= new Song("Blah1", "bob1", "bbbb1", 200, "gladk1");
		System.out.println(mySong.toString());
		myiPod.addSong(mySong);
		myiPod.addSong(mySong2);
		System.out.println(myiPod.toString());
	}
	
	public static void test2() {
		
		// Create an empty iPod
		iPod myiPod= new iPod(50);
		Song[] mySongs = new Song[] { new Song("The Last One You'd Expect","A Gentleman's Guide to Love and Murder Company","A Gentleman's Guide to Love and Murder (Original Broadway Cast Recording)",381,"Soundtrack"),
				                      new Song("Blah1", "bob1", "bbbb1", 200, "gladk1")};
		
		System.out.println("Test2: static array initializer");
		
		// Add your song to the iPod
		for (int i = 0; i < mySongs.length; i++)
		{
			myiPod.addSong(mySongs[i]);
		}
		System.out.println(myiPod.toString());
	}	
}

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
    
    PlayList playList = new PlayList("J's Playlist");
    Song s = new Song("What About Us", "Jodeci");
    Song songy = new Song("Pump It Back", "Jodeci");
    Song another = new Song("Toxic", "Britney spears");
    Song s2 = new Song("All my life", "Lil Durk");
    
  playList.addSong(s);
  playList.addSong(songy);
  playList.addSong(another);
  playList.addSong(s2);
  //playList.displaySongs();
  playList.sortByArtist();
  playList.displaySongs();


   
       
    }
}

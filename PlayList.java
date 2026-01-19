import java.io.*;
import java.util.*;
public class PlayList {
    private String playListName; //the name of the playlist
    private List<Song> songs; //a collection of songs
    private Deque<Song> deque = new ArrayDeque<>();//dequeue for adding and removing songs from a queue

    
    public PlayList(String playListName) {
        this.playListName = playListName;
        songs = new ArrayList<>();
     
        }
        
        //adds songs to the playlist and lets users know if their song is alrady added to the playlist
        public void addSong(Song s) {
                if(!songs.contains(s)) {
                songs.add(s);
                System.out.println("Added to playlist");
                }

            else {
                System.out.println("song already added to playlist");
            }
        }

        //removes a song from the playlist 
        public void removeSong(Song t) {
            songs.remove(t);
        }

        //compares two songs and sorts them in ascending order by title 
        public PlayList sortByTitle() {
            Collections.sort(songs, new Comparator<Song>() {

                public int compare(Song thisSong, Song thatSong) {
                    return thisSong.getTitle().compareToIgnoreCase(thatSong.getTitle());
                }      
            });
            return null;
        }

        //sorts the playlist in ascending order by artist
        public PlayList sortByArtist() {
            Collections.sort(songs, new Comparator<Song>() {

                public int compare(Song s1, Song s2) {
                    return s1.getArtistName().compareToIgnoreCase(s2.getArtistName());
                }      
            });
            return null;
        }

        //shuffles the songs in the playlist
        public void shuffleSongs() {
            Collections.shuffle(songs);
        }

        //adds songs to a queue
        public void addToQueue(Song tune) {
            deque.addLast(tune);
            System.out.println("Added to queue");
        }

        //shows all of the songs in the playlist 
        public void displaySongs() {
            for(Song s1 : songs) {
                System.out.println(s1);
            }
        }

        

    }
    


    


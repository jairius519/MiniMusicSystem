public class Song {
    private String title; //the title of the song
    private String artistName; //the name of the music artist

    //constructor that holds the song title and artist name
    public Song(String title, String artistName) {
        this.title = title;
        this.artistName = artistName;
    }

    //returns the title of the song
    public String getTitle() {
        return title;
    }   

    //returns the artist name
    public String getArtistName() {
        return artistName;
    }

    // displays the song title and the music artist
    public String toString() {
        return title + " - "  + artistName ;
    }
}

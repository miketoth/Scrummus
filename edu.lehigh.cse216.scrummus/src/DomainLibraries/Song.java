/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLibraries;

/**
 *
 * @author zachdaniels
 */
public class Song {
    private String artist;
    private String album;
    private String lyrics;
    private int albumNumber;
    
    public Song(String artist, String album, String lyrics, int albumNumber){
        this.artist = artist;
        this.album = album;
        this.lyrics = lyrics;
        this.albumNumber = albumNumber;
    }
    
    public String getArtist(){
        return artist;
    }
    
    public void setArtist(String artist){
        this.artist = artist;
    }
    
    public String getAlbum(){
        return album;
    }
    
    public void setAlbum(String album){
        this.album = album;
    }
    
    public String getLyrics(){
        return lyrics;
    }
    
    public void setLyrics(String lyrics){
        this.lyrics = lyrics;
    }
    
    public int getAlbumNumber(){
        return albumNumber;
    }
    
    public void setAlbumNumber(int albumNumber){
        this.albumNumber = albumNumber;
    }
    
    @Override
    public String toString(){
        return "artist: " + artist + "album: " + album + "lyrics: " + lyrics + "album number:" + albumNumber + super.toString();
    }
}

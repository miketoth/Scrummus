/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLibraries;

import java.util.Date;

/**
 *
 * @author zachdaniels
 */
public class Song extends Media {
    private String artist;
    private String album;
    private String lyrics;
    private int albumNumber;
    
    public Song(){
        super();
        artist = null;
    }
    
    public Song(String name, int duration, int playCount, String filePath, String image, String encoding, String comment, int id, int fileSize, int year, Date dateAdded, String genre, String artist, String album, String lyrics, int albumNumber){
        super(name, duration, playCount, filePath, image, encoding, comment, id, fileSize, year, dateAdded, genre);
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

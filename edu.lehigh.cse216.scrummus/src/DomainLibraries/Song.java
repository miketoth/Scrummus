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
    String artist;
    String album;
    String lyrics;
    int albumNumber;
    
    @Override
    public String toString(){
        return "artist: " + artist + "album: " + album + "lyrics: " + lyrics + "album number:" + albumNumber + super.toString();
    }
}

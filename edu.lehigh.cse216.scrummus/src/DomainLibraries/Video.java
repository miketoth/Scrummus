/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLibraries;

import java.util.Date;

/**
 *
 * @author Skullum
 */
public class Video extends Media {

    

    
    private int quality;
    private String type;
    private String author;
    private int season;
    private int episode;
    
    
    // default constructor
    public Video(){
        quality = 0;
        type = "Default";
        author = "Default";
        season = 0;
        episode = 0;
    }
    
    public Video(String name, int duration, int playCount, String filePath, String image, String encoding, String comment, int id, int fileSize, int year, Date dateAdded, String genre, int quality, String type, String author, int season, int episode) {
        super(name, duration, playCount, filePath, image, encoding, comment, id, fileSize, year, dateAdded, genre);
        this.quality = quality;
        this.type = type;
        this.author = author;
        this.season = season;
        this.episode = episode;
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString(){
        return "Video: " + super.toString() + " quality: " + quality + " type: " + type + " author" 
                + author + " season: " + season + " episode: " + episode;
    }
    
    /**
     * Getters and Setters
     */
    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getEpisode() {
        return episode;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }
} 

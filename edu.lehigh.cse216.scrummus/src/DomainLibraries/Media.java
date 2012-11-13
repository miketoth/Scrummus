/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLibraries;

import java.util.Date; // deprecated. Replace with Calendar, later


    
    
    
    
/**
 *
 * @author Skullum
 */
public abstract class Media {

    


    
    private String name;
    private int duration; // length of media in minutes. Should be replaced with a better data structure
    private int playCount;
    private String filePath;
    private String image; // path to image. Put in a method which will load the image when called with correct file path
    private String encoding;
    private String comment;
    private int id;
    private int fileSize;
    private int year;
    private  Date dateAdded;
    private String genre;
    
    public Media(){
    }
        
   
    
    public Media(String name, int duration, int playCount, String filePath, String image, String encoding, String comment, int id, int fileSize, int year, Date dateAdded, String genre) {
        this.name = name;
        this.duration = duration;
        this.playCount = playCount;
        this.filePath = filePath;
        this.image = image;
        this.encoding = encoding;
        this.comment = comment;
        this.id = id;
        this.fileSize = fileSize;
        this.year = year;
        this.dateAdded = dateAdded;
        this.genre = genre;
    }
    
    /**
     * Getters and Setters
     */
    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public int getPlayCount() {
        return playCount;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getImage() {
        return image;
    }

    public String getEncoding() {
        return encoding;
    }

    public String getComment() {
        return comment;
    }

    public int getId() {
        return id;
    }

    public int getFileSize() {
        return fileSize;
    }

    public int getYear() {
        return year;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public String getGenre() {
        return genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    @Override
    public String toString() {
        return "Media{" + "name=" + name + ", duration=" + duration + ", playCount=" + playCount + ", filePath=" + filePath + ", image=" + image + ", encoding=" + encoding + ", comment=" + comment + ", id=" + id + ", fileSize=" + fileSize + ", year=" + year + ", dateAdded=" + dateAdded + ", genre=" + genre + "}";
    }
    
}

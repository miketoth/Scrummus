/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLibraries;

/**
 *
 * @author Skullum
 */
public class Video extends Media {
    int quality;
    String type;
    String author;
    int season;
    int episode;
    
    
    // default constructor
    Video(){
        
    }
    
    // constructor with some args
    Video(int quality){
        this.quality= quality;
    }
    
    /**
     * @toString()
     * @return 
     */
    public String toString(){
        return "Video: " + "name: " + name + " duration: " + duration + " Play Count: " + playCount
                 + " File Path: " + filePath + " Art path:" + image + " Encoding: " + encoding + " Genre: " 
                + genre + " Comment: " + comment + " ID: " + id + " File Size: " + fileSize + " Year: " + year
                +  "quality: " + quality + " type: " + type + " author" 
                + author + " season: " + season + " episode: " + episode;
    }
}

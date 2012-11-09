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
    String name;
    int duration; // length of media in minutes. Should be replaced with a better data structure
    int playCount;
    String filePath;
    String image; // path to image. Put in a method which will load the image when called with correct file path
    String encoding;
    String comment;
    int id;
    int fileSize;
    int year;
    Date dateAdded;
    String genre;
    
    public String toString(){
        return "name: " + name;
    }
    
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLibraries;

/**
 *
 * @author Ryan
 */
public class MediaList{   

    private int id;
    private int size;
    private String name;

    MediaList(){}
    
    public MediaList(int id, int size, String name) {
        this.id = id;
        this.size = size;
        this.name = name;
    } 
    
    public void add(String n){
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int i){
        this.id = i;
    }
    
    public int getSize(){
        return this.size;
    }
    
    public void setSize(int s){
        this.size = s;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String n){
        this.name = n;
    }
    
    public String toString() {
        return "MediaList{" + "id=" + id + ", size=" + size + ", name=" + name + "}";
    }
}

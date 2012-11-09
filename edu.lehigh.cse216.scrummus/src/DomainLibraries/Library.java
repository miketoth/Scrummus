/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLibraries;

/**
 *
 * @author Skullum
 */
public class Library {

    public Library(){
        name = "Default";
        size = 0;
    }
    
    public Library(String name, int size) {
        this.name = name;
        this.size = size;
    }
    
    private String name;
    private int size;
    
    @Override
    public String toString(){
        return " Library: " + "name: " + name + " size: " + size; 
    }
    
    
    /**
     * Getters and Setters
     * @return 
     */
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLibraries;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zachdaniels
 */
public class LibraryTest {
    
    public LibraryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Library.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Library instance = new Library();
        instance.setName("Test");
        String expResult = "Test";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setName method, of class Library.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Test";
        Library instance = new Library();
        instance.setName(name);
        String result = instance.getName();
        assertEquals(name, result);
    }

    /**
     * Test of getSize method, of class Library.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        Library instance = new Library();
        int expResult = 5;
        instance.setSize(5);
        int result = instance.getSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSize method, of class Library.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        int size = 5;
        Library instance = new Library();
        instance.setSize(size);
        instance.setSize(5);
    }

    /**
     * Test of toString method, of class Library.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Library instance = new Library();
        instance.setName("Test");
        instance.setSize(5);
        String expResult = "Library{" + "name=" + instance.getName() + ", size=" + instance.getSize() + "}";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
}

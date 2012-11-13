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
public class MediaListTest {
    
    public MediaListTest() {
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
     * Test of add method, of class MediaList.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String n = "Test";
        MediaList instance = new MediaList();
        instance.add(n);
    }

    /**
     * Test of getId method, of class MediaList.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        MediaList instance = new MediaList();
        int expResult = 5;
        instance.setId(5);
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class MediaList.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        MediaList instance = new MediaList();
        int expResult = 5;
        instance.setId(5);
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSize method, of class MediaList.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        MediaList instance = new MediaList();
        int expResult = 5;
        instance.setSize(5);
        int result = instance.getSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSize method, of class MediaList.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        MediaList instance = new MediaList();
        int expResult = 5;
        instance.setSize(5);
        int result = instance.getSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class MediaList.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        MediaList instance = new MediaList();
        String expResult = "Test";
        instance.setName("Test");
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class MediaList.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        MediaList instance = new MediaList();
        String expResult = "Test";
        instance.setName("Test");
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class MediaList.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        MediaList instance = new MediaList();
        instance.setId(5);
        instance.setSize(50);
        instance.setName("Test");
        String expResult = "MediaList{" + "id=" + instance.getId() + ", size=" + instance.getSize() + ", name=" + instance.getName() + "}";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}

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
public class VideoTest {
    
    public VideoTest() {
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
     * Test of getQuality method, of class Video.
     */
    @Test
    public void testGetQuality() {
        System.out.println("getQuality");
        Video instance = new Video();
        int expResult = 5;
        instance.setQuality(5);
        int result = instance.getQuality();
        assertEquals(expResult, result);
    }

    /**
     * Test of setQuality method, of class Video.
     */
    @Test
    public void testSetQuality() {
        System.out.println("setQuality");
        Video instance = new Video();
        int expResult = 5;
        instance.setQuality(5);
        int result = instance.getQuality();
        assertEquals(expResult, result);
    }

    /**
     * Test of getType method, of class Video.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Video instance = new Video();
        instance.setType("Test");
        String expResult = "Test";
        String result = instance.getType();
        assertEquals(expResult, result);
    }

    /**
     * Test of setType method, of class Video.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        Video instance = new Video();
        instance.setType("Test");
        String expResult = "Test";
        String result = instance.getType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAuthor method, of class Video.
     */
    @Test
    public void testGetAuthor() {
        System.out.println("getAuthor");
        Video instance = new Video();
        String expResult = "Test";
        instance.setAuthor("Test");
        String result = instance.getAuthor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAuthor method, of class Video.
     */
    @Test
    public void testSetAuthor() {
        System.out.println("setAuthor");
        Video instance = new Video();
        String expResult = "Test";
        instance.setAuthor("Test");
        String result = instance.getAuthor();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSeason method, of class Video.
     */
    @Test
    public void testGetSeason() {
        System.out.println("getSeason");
        Video instance = new Video();
        int expResult = 5;
        instance.setSeason(5);
        int result = instance.getSeason();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSeason method, of class Video.
     */
    @Test
    public void testSetSeason() {
        System.out.println("setSeason");
        Video instance = new Video();
        int expResult = 5;
        instance.setSeason(5);
        int result = instance.getSeason();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEpisode method, of class Video.
     */
    @Test
    public void testGetEpisode() {
        System.out.println("getEpisode");
        Video instance = new Video();
        int expResult = 5;
        instance.setEpisode(5);
        int result = instance.getEpisode();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEpisode method, of class Video.
     */
    @Test
    public void testSetEpisode() {
        System.out.println("setEpisode");
        Video instance = new Video();
        int expResult = 5;
        instance.setEpisode(5);
        int result = instance.getEpisode();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Video.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Video instance = new Video();
        instance.setQuality(5);
        instance.setType("Test1");
        instance.setAuthor("Test2");
        instance.setSeason(50);
        instance.setEpisode(500);
        String expResult = "Video{" + "quality=" + instance.getQuality() + ", type=" + instance.getType() + ", author=" + instance.getAuthor() + ", season=" + instance.getSeason() + ", episode=" + instance.getEpisode() + "}";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}

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
public class SongTest {
    
    public SongTest() {
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
     * Test of getArtist method, of class Song.
     */
    @Test
    public void testGetArtist() {
        System.out.println("getArtist");
        Song instance = new Song();
        String expResult = "Test";
        instance.setArtist("Test");
        String result = instance.getArtist();
        assertEquals(expResult, result);
    }

    /**
     * Test of setArtist method, of class Song.
     */
    @Test
    public void testSetArtist() {
        System.out.println("setArtist");
        Song instance = new Song();
        String expResult = "Test";
        instance.setArtist("Test");
        String result = instance.getArtist();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAlbum method, of class Song.
     */
    @Test
    public void testGetAlbum() {
        System.out.println("getAlbum");
        Song instance = new Song();
        String expResult = "Test";
        instance.setAlbum("Test");
        String result = instance.getAlbum();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAlbum method, of class Song.
     */
    @Test
    public void testSetAlbum() {
        System.out.println("setAlbum");
        Song instance = new Song();
        String expResult = "Test";
        instance.setAlbum("Test");
        String result = instance.getAlbum();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLyrics method, of class Song.
     */
    @Test
    public void testGetLyrics() {
        System.out.println("getLyrics");
        Song instance = new Song();
        String expResult = "Test";
        instance.setLyrics("Test");
        String result = instance.getLyrics();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLyrics method, of class Song.
     */
    @Test
    public void testSetLyrics() {
        System.out.println("setLyrics");
        Song instance = new Song();
        String expResult = "Test";
        instance.setLyrics("Test");
        String result = instance.getLyrics();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAlbumNumber method, of class Song.
     */
    @Test
    public void testGetAlbumNumber() {
        System.out.println("getAlbumNumber");
        Song instance = new Song();
        int expResult = 5;
        instance.setAlbumNumber(5);
        int result = instance.getAlbumNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAlbumNumber method, of class Song.
     */
    @Test
    public void testSetAlbumNumber() {
        System.out.println("setAlbumNumber");
        Song instance = new Song();
        int expResult = 5;
        instance.setAlbumNumber(5);
        int result = instance.getAlbumNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Song.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Song instance = new Song();
        instance.setArtist("Test1");
        instance.setAlbum("Test2");
        instance.setLyrics("Test3");
        instance.setAlbumNumber(5);
        String expResult = "Song{" + "artist=" + instance.getArtist() + ", album=" + instance.getAlbum() + ", lyrics=" + instance.getLyrics() + ", albumNumber=" + instance.getAlbumNumber() + "}";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}

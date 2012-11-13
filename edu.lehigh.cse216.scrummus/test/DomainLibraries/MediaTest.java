/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLibraries;

import java.util.Date;
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
public class MediaTest {
    
    public MediaTest() {
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
     * Test of getName method, of class Media.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Media instance = new MediaImpl();
        instance.setName("Test");
        String expResult = instance.getName();
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDuration method, of class Media.
     */
    @Test
    public void testGetDuration() {
        System.out.println("getDuration");
        Media instance = new MediaImpl();
        instance.setDuration(5);
        int expResult = 5;
        int result = instance.getDuration();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPlayCount method, of class Media.
     */
    @Test
    public void testGetPlayCount() {
        System.out.println("getPlayCount");
        Media instance = new MediaImpl();
        instance.setPlayCount(5);
        int expResult = 5;
        int result = instance.getPlayCount();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFilePath method, of class Media.
     */
    @Test
    public void testGetFilePath() {
        System.out.println("getFilePath");
        Media instance = new MediaImpl();
        String expResult = "\test";
        instance.setFilePath("\test");
        String result = instance.getFilePath();
        assertEquals(expResult, result);
    }

    /**
     * Test of getImage method, of class Media.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        Media instance = new MediaImpl();
        String expResult = "Test.bmp";
        instance.setImage("Test.bmp");
        String result = instance.getImage();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEncoding method, of class Media.
     */
    @Test
    public void testGetEncoding() {
        System.out.println("getEncoding");
        Media instance = new MediaImpl();
        String expResult = "Test";
        instance.setEncoding("Test");
        String result = instance.getEncoding();
        assertEquals(expResult, result);
    }

    /**
     * Test of getComment method, of class Media.
     */
    @Test
    public void testGetComment() {
        System.out.println("getComment");
        Media instance = new MediaImpl();
        String expResult = "Test";
        instance.setComment("Test");
        String result = instance.getComment();
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class Media.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Media instance = new MediaImpl();
        int expResult = 5;
        instance.setId(5);
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFileSize method, of class Media.
     */
    @Test
    public void testGetFileSize() {
        System.out.println("getFileSize");
        Media instance = new MediaImpl();
        int expResult = 5;
        instance.setFileSize(5);
        int result = instance.getFileSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of getYear method, of class Media.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        Media instance = new MediaImpl();
        int expResult = 2000;
        instance.setYear(2000);
        int result = instance.getYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDateAdded method, of class Media.
     */
    @Test
    public void testGetDateAdded() {
        System.out.println("getDateAdded");
        Media instance = new MediaImpl();
        Date expResult = new Date();
        instance.setDateAdded(expResult);
        Date result = instance.getDateAdded();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGenre method, of class Media.
     */
    @Test
    public void testGetGenre() {
        System.out.println("getGenre");
        Media instance = new MediaImpl();
        String expResult = "Test";
        instance.setGenre("Test");
        String result = instance.getGenre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Media.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        Media instance = new MediaImpl();
        instance.setName("Test");
        String expResult = instance.getName();
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDuration method, of class Media.
     */
    @Test
    public void testSetDuration() {
        System.out.println("setDuration");
        Media instance = new MediaImpl();
        instance.setDuration(5);
        int expResult = 5;
        int result = instance.getDuration();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPlayCount method, of class Media.
     */
    @Test
    public void testSetPlayCount() {
        System.out.println("setPlayCount");
        Media instance = new MediaImpl();
        instance.setPlayCount(5);
        int expResult = 5;
        int result = instance.getPlayCount();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFilePath method, of class Media.
     */
    @Test
    public void testSetFilePath() {
        System.out.println("setFilePath");
        Media instance = new MediaImpl();
        String expResult = "\test";
        instance.setFilePath("\test");
        String result = instance.getFilePath();
        assertEquals(expResult, result);
    }

    /**
     * Test of getImage method, of class Media.
     */
    @Test
    public void testSetImage() {
        System.out.println("setImage");
        Media instance = new MediaImpl();
        String expResult = "Test.bmp";
        instance.setImage("Test.bmp");
        String result = instance.getImage();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEncoding method, of class Media.
     */
    @Test
    public void testSetEncoding() {
        System.out.println("setEncoding");
        Media instance = new MediaImpl();
        String expResult = "Test";
        instance.setEncoding("Test");
        String result = instance.getEncoding();
        assertEquals(expResult, result);
    }

    /**
     * Test of getComment method, of class Media.
     */
    @Test
    public void testSetComment() {
        System.out.println("setComment");
        Media instance = new MediaImpl();
        String expResult = "Test";
        instance.setComment("Test");
        String result = instance.getComment();
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class Media.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Media instance = new MediaImpl();
        int expResult = 5;
        instance.setId(5);
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFileSize method, of class Media.
     */
    @Test
    public void testSetFileSize() {
        System.out.println("setFileSize");
        Media instance = new MediaImpl();
        int expResult = 5;
        instance.setFileSize(5);
        int result = instance.getFileSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of getYear method, of class Media.
     */
    @Test
    public void testSetYear() {
        System.out.println("setYear");
        Media instance = new MediaImpl();
        int expResult = 2000;
        instance.setYear(2000);
        int result = instance.getYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDateAdded method, of class Media.
     */
    @Test
    public void testSetDateAdded() {
        System.out.println("setDateAdded");
        Media instance = new MediaImpl();
        Date expResult = new Date();
        instance.setDateAdded(expResult);
        Date result = instance.getDateAdded();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGenre method, of class Media.
     */
    @Test
    public void testSetGenre() {
        System.out.println("setGenre");
        Media instance = new MediaImpl();
        String expResult = "Test";
        instance.setGenre("Test");
        String result = instance.getGenre();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Media.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Media instance = new MediaImpl();
        instance.setName("Test1");
        instance.setDuration(5);
        instance.setPlayCount(50); 
        instance.setFilePath("Test2");
        instance.setImage("Test.bmp");
        instance.setEncoding("Test3"); 
        instance.setComment("Test4");
        instance.setId(500); 
        instance.setFileSize(5000); 
        instance.setYear(2000);
        instance.setDateAdded(new Date());
        instance.setGenre("Test5");
        String expResult = "Media{" + "name=" + instance.getName() + ", duration=" + instance.getDuration() + ", playCount=" + instance.getPlayCount() + ", filePath=" + instance.getFilePath() + ", image=" + instance.getImage() + ", encoding=" + instance.getEncoding() + ", comment=" + instance.getComment() + ", id=" + instance.getId() + ", fileSize=" + instance.getFileSize() + ", year=" + instance.getYear() + ", dateAdded=" + instance.getDateAdded() + ", genre=" + instance.getGenre() + '}';
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    public class MediaImpl extends Media {
    }
}

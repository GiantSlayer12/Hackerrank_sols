/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchalgos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Terraformer
 */
public class BinarySearchTest {
    
    public BinarySearchTest() {
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
     * Test of main method, of class BinarySearch.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        BinarySearch.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class BinarySearch.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        int[] t = null;
        int first = 0;
        int last = 0;
        int c = 0;
        int expResult = 0;
        int result = BinarySearch.search(t, first, last, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

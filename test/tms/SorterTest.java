/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author derwin
 */
public class SorterTest {
    
    public SorterTest() {
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
     * Test of getItems method, of class Sorter.
     */
    @Test
    public void testGetItems() {
        System.out.println("getItems");
        Sorter instance = new Sorter(100);
        int[] result = instance.getItems();
        assertEquals(100, result.length);
    }

    @Test
    public void testGetFixedItems() {
        System.out.println("getItems");
        int[] in = {1,3,4,5,6,7,8};
        Sorter instance = new Sorter(in);
        int[] result = instance.getItems();
        assertArrayEquals(in, result);
    }

    /**
     * Test of getSorted method, of class Sorter.
     */
    @Test
    public void testGetSorted() {
        System.out.println("getSorted");
        int[] in = {1,4,3,2,5,6,7,2};
        Sorter instance = new Sorter(in);
        int[] expResult = {1,2,2,3,4,5,6,7};
        int[] result = instance.getSorted();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of merge method, of class Sorter.
     */
    @Test
    public void testMerge() {
        System.out.println("merge");
        int[] left = {1,3,5,7,9};
        int[] right = {2,4,6,8,10};
        Sorter instance = new Sorter();
        int[] expResult = {1,2,3,4,5,6,7,8,9,10};
        int[] result = instance.merge(left, right);
        assertArrayEquals(expResult, result);
    }
    
}

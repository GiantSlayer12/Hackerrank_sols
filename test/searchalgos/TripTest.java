/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchalgos;

import java.util.Arrays;
import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author Terraformer
 */
public class TripTest extends TestCase {
    
    TripPlanning trip = new TripPlanning();
    int [] expected = new int []{ 2, 0 , 6, 3, 5};
    int [] input = new int []{ 1 , 2 ,3 , 3, 2, 1, 4};
    
    @Test
    public void testSolution(){
        
        assertEquals( Arrays.toString(expected) , Arrays.toString(trip.solution(2,new int []{ 1 , 2 ,3 , 3, 2, 1, 4} )));
        
    }
    
    
    
}

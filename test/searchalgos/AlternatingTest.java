/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchalgos;

import junit.framework.TestCase;

/**
 *
 * @author Terraformer
 */
public class AlternatingTest extends TestCase{
    AlternatingCharacters asc;
    public void testDeletions(){
        assertEquals(3,asc.deletions("AAAA"));
        assertEquals(4, asc.deletions("BBBBB"));
        assertEquals(0, asc.deletions("ABABABAB"));
        assertEquals(0, asc.deletions("BABABA"));
        assertEquals(4, asc.deletions("AAABBB"));
        
    }
    
}

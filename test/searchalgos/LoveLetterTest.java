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
public class LoveLetterTest extends TestCase{
    
    LoveLetter l;
    
    public void testLoveLetterMystery(){
        assertEquals(2, LoveLetter.loveLetterMystery("abc"));
        assertEquals(4, LoveLetter.loveLetterMystery("abcd"));
        assertEquals(0, LoveLetter.loveLetterMystery("abcba"));
        assertEquals(2, LoveLetter.loveLetterMystery("cba"));
    }
    
}

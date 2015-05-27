/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchalgos;
import junit.framework.*;

/**
 *
 * @author Terraformer
 */
public class MaxXorTest extends TestCase{

    static MaxXor maXor;
    
    @Override
    protected void setUp() throws Exception {
        MaxXor maXor = new MaxXor();
        super.setUp(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    public void testmaxXor(){
        assertEquals(15,maXor.maxXor(1,10));
        assertEquals(7, MaxXor.maxXor(10, 15));
    }
    
}

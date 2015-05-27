/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchalgos;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Terraformer
 */
public class AngryChildren {
    
    public static void main(String [] args){
        
    }
    
    static int unfairness(ArrayList<Integer> list){
        return Collections.max(list) - Collections.min(list);
    }
    
}

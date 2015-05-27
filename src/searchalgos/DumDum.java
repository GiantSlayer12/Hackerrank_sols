/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchalgos;

import java.util.Scanner;

/**
 *
 * @author Terraformer
 */
public class DumDum {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        String word = scanner.next().trim();
        
        int count = word.split("\\s+").length;
        
        System.out.println(count);
        
       
    }

    
}

package searchalgos;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Terraformer
 */
public class AlternatingCharacters {
    
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] inputs = new String[n];
        for(int i = 0; i < inputs.length; i++){
            inputs[i] = scanner.next();
        }
        
        for (String input : inputs) {
            System.out.println(deletions(input));
        }
    }
    
    static int deletions(String input){
        char[] chars = input.toCharArray();
        char temp = chars[0];
        int count = 0;
        for(int i = 1; i < chars.length; ++i){
            if(temp == chars[i]){
                count++;
            }
            else {
                temp = chars[i];
            }
        }
        return count;
    }
    
}

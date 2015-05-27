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
public class LoveLetter {
    
static int loveLetterMystery(String word)
{
    char[] str = word.toCharArray();
    int end = str.length - 1;
    int ops = 0;
    for(int i = 0; i < end; i++){
        ops += str[i] - str[end];
        end--;
    }
    return Math.abs(ops);
}

public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
    int n;
    //String str;

    n = input.nextInt();
    
    String [] inputs = new String[n];
    
    for (int i = 0; i < n; i++) {
        inputs[i] = input.next();
    }
    
    for(int i = 0; i < n; i++){
        System.out.println(loveLetterMystery(inputs[i]));
    }
}

}
    
    
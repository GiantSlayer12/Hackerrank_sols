package searchalgos;


import java.util.ArrayList;
import java.util.Collections;
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
public class MaxXor {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        System.out.println(maxXor(l, r));
    }
    
    static int maxXor(int l , int r){
        ArrayList<Integer> xorList = new ArrayList<>();
        for(int i = l; i <= r; i++){
            for(int j = i; j <= r; j++){
                xorList.add(i ^ j);
            }
        }
        return Collections.max(xorList);
    }
    
}

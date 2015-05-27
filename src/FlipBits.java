
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
public class FlipBits {
    
    public static void main(String [] args){
//        System.out.println(Integer.toBinaryString(60));
//        System.out.println(Integer.toBinaryString(flipBits(60)));
//        System.out.println( 1  ^ 4294967295L);
//        System.out.println( 2147483647 ^ 4294967295L);
        
        Scanner in = new Scanner(System.in);
        int _a_size = Integer.parseInt(in.nextLine());
        long[] _a = new long[_a_size];
        for(int i = 0 ; i < _a_size; i++){
            _a[i] = in.nextLong();
        }
        
        for(int i = 0; i < _a_size; i++){
            System.out.println(_a[i] ^ 4294967295L );
        }
        
        //System.out.println( 0  ^ 4294967295L);
    }
    
//    static int flipBits(int n){
//        return ~n;
//    }
    
}

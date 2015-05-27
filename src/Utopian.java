
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
public class Utopian {
    
    public static void main(String[] args){
//        for(int i = 0; i < 10; i++){
//            System.out.println("utopian(" + i + ")" + " = " + utopian(i));
//        }
        Scanner in = new Scanner(System.in);
        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        for(int i = 0 ; i < _a_size; i++){
            _a[i] = in.nextInt();
        }
        
        for(int i = 0; i < _a_size; i++){
            System.out.println(utopian(_a[i]) );
        }
    }
    
    static int utopian(int n){
        if (n == 0){
            return 1;
        }else{
            if(n % 2 != 0){
                return 2 * utopian(n - 1);
            }else{
                return utopian(n - 1) + 1;
            }
        }
    }
    
}

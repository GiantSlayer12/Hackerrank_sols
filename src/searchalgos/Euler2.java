/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchalgos;

/**
 *
 * @author Terraformer
 */
public class Euler2 {
    

    public static void main(String[] args){

	long sum  = 0;
	long result = 0;
        long fib1 = 0;
        long fib2 = 0;
	while (result < 4000000){
            if((result % 2) == 0){
                sum += result;
            }
            result = fib1 + fib2;
            fib2 = fib1;
            fib1 = result;
            //result++;
        }
        System.out.println(sum);
    }

}

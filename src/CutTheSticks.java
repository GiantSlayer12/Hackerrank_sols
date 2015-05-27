
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
public class CutTheSticks {
    
        public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int no_of_testcase=s.nextInt();
		int values;
		int j;
		
		ArrayList<Integer> arrlist = new ArrayList<Integer>(no_of_testcase);
		for(int i=0;i<no_of_testcase;i++)
		{
			values=s.nextInt();
			arrlist.add(values);
		}
		while(arrlist.size()>0){
		j=0;
		System.out.println(arrlist.size());
			int min=Collections.min(arrlist);
			for(int i=0;i<arrlist.size();i++)
			{
				arrlist.set(i,arrlist.get(i)- min);
			}
			//System.out.println(arrlist);
			while(j<arrlist.size())
			{
				if(arrlist.get(j)==0){
					arrlist.remove(j);
					j--;
				}
				j++;
			}
			
    }
}
    
}

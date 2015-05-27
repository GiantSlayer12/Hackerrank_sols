/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Terraformer
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Collections;
import java.util.Set;

public class LonelyInteger{

//static Timer timer;
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int res;
        
        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        
        res = findMinDuplicateInt(_a);
        System.out.println(res);
    }
	public static int findMinDuplicateInt(int [] inputs){

		Map <Integer,Integer> intMap = new HashMap<>();
                for(int input : inputs){
			if(intMap.containsKey(input)){
				intMap.put(input,intMap.get(input) + 1);
			}else{
				intMap.put(input,1);
			}
		}
                List<Integer> valueList = new ArrayList<>(intMap.values());
                Collections.sort(valueList);
                return getKey(valueList.get(0), intMap);

            }
        
        public static int getKey(int value, Map testMap){
            int n = 0;
            Set<Map.Entry<Integer,Integer>> entrySet =  testMap.entrySet();
            for(Map.Entry<Integer,Integer> entry : entrySet){
                if(entry.getValue() == value){
                    n = entry.getKey();
                }
            }
            return n;
        }
}

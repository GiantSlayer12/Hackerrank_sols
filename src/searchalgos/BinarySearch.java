
package searchalgos;

/**
 *
 * @author Terraformer
 */
public class BinarySearch {
    
    public static void main(String[] args){
    
        System.out.println(""+ search(new int[]{1,2,3,4,5,6,7,8},1,8, 4));
    
    }
    
    public static int search(int [] t, int first, int last, int c){
    int cur;
    while(true){
        cur = first + last / 2;
        if(t[cur] == c){
        return cur;
        }else {
            if(t[cur] < c){
                return search(t,cur + 1, last ,c);
            }else{
                return search(t,first, cur - 1,c);
            }
        }
    }
    
    
    }
    
}

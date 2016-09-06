
package plateau;
import java.util.*;
/**
 *
 * @author Amanda Alfaro
 * CSC 3380
 * HOMEWORK5
 */
public class plateau {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter integers to enter into an array. Press" + " any letter to continue. Integers: ");
        while(cin.hasNextInt()){
            list.add(cin.nextInt());
        }
        
        System.out.println("Your array is:"+list);
        int count = 1;
        int plateau = 0;
        int i = 0;
        int j = i;
        
        for(i=0;i<list.size()-1;i++){
            j++;
            if(list.get(i)==list.get(j)){
                count = count +1;
                if(plateau<count){
                    plateau = count;
                }
            }else{
                plateau = 1;
            }
        
        }
        System.out.println("The longest plateau length is "+plateau);
    }
    
}

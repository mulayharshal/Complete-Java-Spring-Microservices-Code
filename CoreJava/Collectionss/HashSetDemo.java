package CoreJava.Collectionss;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String []args){

        Set<Integer> nums=new HashSet<>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.add(6);
        nums.add(5);

         
        Iterator<Integer> vlaues=nums.iterator();

        while(vlaues.hasNext()){
            System.out.println(vlaues.next());
        }

        // for(int n:nums){
        //     System.out.println(n);
        // }
    }
    
}

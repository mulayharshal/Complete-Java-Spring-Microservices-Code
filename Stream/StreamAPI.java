package Stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String []args){
        List<Integer> nums=Arrays.asList(4,5,7,3,2,6);

        // Consumer<Integer> con =n-> System.out.println(n);

        // nums.forEach(con);

        // Stream<Integer> s1=nums.stream();
        // Stream<Integer> s2=s1.filter(n-> n%2==0);
        // s2.forEach(n-> System.out.println(n));

        int result=nums.stream()
                        .filter(n->n%2==0)
                        .map(n -> n*2)
                        .reduce(0,(c,e)->c+e);
        System.out.println(result);

    }
    
}

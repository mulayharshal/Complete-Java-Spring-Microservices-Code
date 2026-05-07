package Stream;

import java.util.*;

public class MethodRefEx {
    public static void main(String [] arg){
        List<String> names= Arrays.asList("Navin", "Harsh", "john");

        List<String> uNames=names.stream()
                            .map(String :: toUpperCase)
                            .toList();

        System.out.println(uNames);
    }
    
}

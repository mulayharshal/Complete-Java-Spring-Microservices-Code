package Stream;

import java.util.*;

public class OptionalEx {
    public static void main(String []args){
        List<String> names=Arrays.asList("navin","laxmi","johan");

        String name=names.stream()
                        .filter(str -> str.contains("x"))
                        .findFirst()
                        .orElse("Not Found");
        
        System.out.println(name);
    }
}

package CoreJava.Collectionss;
import java.util.*;

public class MapDemo {
    public static void main(String []args){
     
        Map<String,Integer> students=new HashMap<>();

        students.put("harshal", 41);
        students.put ("mulay", 42);
        students.put("hm", 43);
        students.put("harsh", 44);

        System.out.println(students.get("harshal"));

        System.out.println(students.keySet());

        for(String name:students.keySet()){
            System.out.println(name +" : "+students.get(name));
        }
    }
    
}

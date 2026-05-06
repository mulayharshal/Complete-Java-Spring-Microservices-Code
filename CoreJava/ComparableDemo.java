package CoreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    
    public int compareTo(Student that) {
        if(this.age>that.age)
            return 1;
        else
            return -1;
    }
    
}
public class ComparableDemo {
    public static void main(String []args){

        List<Student> studs=new ArrayList<>();
        studs.add(new Student(21, "harshal"));
        studs.add(new Student(12, "hm"));
        studs.add(new Student(18, "mulay"));
        studs.add(new Student(20, "harsh"));

        Collections.sort(studs);
        for (Student s:studs){
            System.out.println(s);
        }

    }
    
}

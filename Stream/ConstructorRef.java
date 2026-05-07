package Stream;

import java.util.*;


class Student{
    private String name;
    private int age;
    public Student() {
    }
    public Student(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
    
}

public class ConstructorRef {
    public static void main(String [] arg){
        List<String> names= Arrays.asList("Navin", "Harsh", "john");

        List<Student> students=new ArrayList<>();

        students=names.stream()
                    .map(Student::new)   //constructor refrences
                    .toList();

        System.out.println(students);
    }
    
}

package CoreJava.OOP;

public class constructor {
    public static void main(String[] a){
        Human obj=new Human();
        Human obj1=new Human(20, "Harshal");

        System.out.println(obj.getName()+" : "+obj.getAge());
        System.out.println(obj1.getName()+" : "+obj1.getAge());

    }
    
}
class Human{
    private int age ;
    private String name;

    public Human(){
        this.age=12;
        this.name="John";
    }
    public Human(int age,String name){
        this.age=age;
        this.name=name;
    }
    
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

}
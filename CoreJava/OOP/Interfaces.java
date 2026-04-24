// package CoreJava.OOP;

public class Interfaces {
    public static void main (String []a){

        B obj=new B();
        obj.show();
        obj.config();
        obj.run();

        System.out.println(A.area);


    }
}


interface A{
    int a=44;   //final and statc
    String area="Mumbai";
    void show();
    void config();
}
interface X{
    void run();
}
class B implements A,X{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
    public void run(){
        System.out.println("running...");
    }
}

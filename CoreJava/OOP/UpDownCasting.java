package CoreJava.OOP;

public class UpDownCasting {

    public  static void main(String ar[]){

        // upcasting
        A obj=new B();
        obj.show1();
        // obj.show2();  //not able


        // DownCassting
        B obj1=(B)obj;
        obj1.show1();
        obj1.show2();

    }
    
}

class A{
    public  void show1(){
        System.out.println("in B show");
    }
}
class B extends A{
    public void show2(){
        System.out.println("in B show");
    }
}

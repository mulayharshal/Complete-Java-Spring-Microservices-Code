// package CoreJava.OOP;

abstract class A{
    public abstract void show();
}

public class AbstractAnonymousInnerClass {
    public static void main (String []args){

        A obj= new A()
        {
            public void show(){
                System.out.print("in new show 1");
            }
        };
        obj.show();
    }
}

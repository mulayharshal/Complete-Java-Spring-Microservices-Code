package CoreJava.OOP;

class A{
    public void show(){
        System.out.println("in A Show");
    }
}

public interface AnonymousInnerClass {
    public static void main (String []arg){
        A obj=new A()
        {
            public void show(){
                System.out.println("in new Show");
            }
        };
        obj.show();
    }
    
}

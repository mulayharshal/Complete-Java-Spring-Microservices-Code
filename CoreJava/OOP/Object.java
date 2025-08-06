package CoreJava.OOP;

class Calculator{
    int a;
    int b;
    public int add(int a , int b){
        System.out.println("in add");
        return a+b;
    }
}

public class Object {
    public static void main(String [] a){
        int n1=4;
        int n2=5;

        Calculator calc=new Calculator();
        calc.a=10;
        int result=calc.add(n1,n2);
        System.out.println(result);
    }
    
}

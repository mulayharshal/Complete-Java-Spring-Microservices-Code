package CoreJava;




@FunctionalInterface
interface A{
    void show();
}

@FunctionalInterface
interface B{
    void show(int i);

}

@FunctionalInterface
interface C{
    int add(int a, int b);
}

public class Lambda {
    public static void main (String []args){

        // lambda expression
        A obj = () -> System.out.println("in show A ");
        obj.show();

        B obj1= (i) -> System.out.println("in show B : "+i);
        obj1.show(5);


        C obj2=(a,b)->a+b;
        System.out.println(obj2.add(3, 8));
    }

    
}

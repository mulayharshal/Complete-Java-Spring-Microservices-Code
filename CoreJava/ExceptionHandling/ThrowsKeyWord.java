class A{
    public void show() throws ClassNotFoundException{
       Class.forName("ThrowsKeyWord");
    }
}

public class ThrowsKeyWord {
    static{
        System.out.println("class loaded");
    }
    public static void main (String [] arg) {
        A obj =new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            // e.printStackTrace();
            System.out.println(e.toString());
        }
    }
    
}

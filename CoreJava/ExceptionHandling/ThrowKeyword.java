package CoreJava.ExceptionHandling;

public class ThrowKeyword {
    public static void main (String a[]){
        int i=20;
        int j=0; 
        try{
            if(j==0)
                throw new ArithmeticException("dont divide by zero");

            j=18/i;
        }
        catch(ArithmeticException e){
            j=18/1;
            System.out.println("this default "+e);
        }
        System.out.println(j);
    }
    
}

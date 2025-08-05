package CoreJava;

public class TypeCasting {
    public static void main(String[] args) {
        byte b=127;
        int a=12;
        // b=a  ;  //wrong
        a=b;        //right
        b=(byte)a;   //right but loose data

    }
    
}

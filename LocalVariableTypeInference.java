// class var{   // error dont user "var" for class name
// }

public class LocalVariableTypeInference {
    public static void main(String []args){
        int a=9;
        var b=8;
        String var="Harshal";    //we can use here also var

        int c;
        var d=10;

        int nums[]=new int[5];
        var num=new int[10];

        var obj=new LocalVariableTypeInference();
    }
    
}

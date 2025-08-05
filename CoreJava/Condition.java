package CoreJava;

public class Condition {
    
    public static void main (String [] args){

        // if else
        int x=18;
        if(x>=18){
            System.out.println("Hello");
        }else{
            System.out.println("Bye");
        } 


        // if  else if  else
        int a=51;
        int y=71;
        int z=81;
        if(a>y && a>z){
            System.out.println(a);
        }else if(y>a && y>z){
            System.out.println(y);
        }else{
            System.out.println(z);
        }


        // turnery operator
        int n=4;
        boolean re =n%2==0?true:false;

        // switch
        int d=3;
        switch(d){
            case 1:System.out.println("monday");
                break;
            case 2:System.out.println("tuesday");
                break;
            case 3:System.out.println("wensday");
                break;
            case 4:System.out.println("thursday");
                break;
            case 5:System.out.println("friday");
                break;
            case 6:System.out.println("saturday");
                break;
            case 7:System.out.println("sonday");
                break;
            default:System.out.println("wrong");
        }


    }
}

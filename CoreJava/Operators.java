package CoreJava;

public class Operators {
    public static void main(String[] args) {
        int num = 7;
        // int num2=5;
        // int result =num1%num2;

        // num1=num1+1;
        // num+=1;
        // num++;
        // ++num;
        // --num;

        int result = num++; // featch the vlaue then increment
        // int result=++num //first incremnt then fetch
        System.out.println(num);
        System.out.println(result);


        int x=6;
        int y=5;

        boolean check=  x>=y ;
        boolean isEqual= x==y ;
        System.out.println(check);
        System.out.println(isEqual);

        int a=9;
        int b=3;
        boolean re=x>y  &&  a<b;
        System.out.println(re);
    }

}

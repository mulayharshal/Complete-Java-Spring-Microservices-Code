// package CoreJava.OOP;

public class Inheritance {
    public static void main(String [] args){
        VeryAdvCalc cal=new VeryAdvCalc();
        int r1=cal.add(3,8);
        int r2=cal.sub(9,3);
        int r3=cal.multi(7,4);
        int r4=cal.div(34,12);
        double r5=cal.power(3,2);

        System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);

    }
}

class Calc{
    int add(int a,int b){
        return a+b;
    }
    int sub(int a,int b){
        return a-b;
    }
}
class AdvCalc extends Calc{
    int multi(int a,int b){
        return a*b;
    }
    int div(int a,int b){
        return a/b;
    }

}
class VeryAdvCalc extends AdvCalc{
    double power(int a,int b){
        return Math.pow(a, b);
    }
}
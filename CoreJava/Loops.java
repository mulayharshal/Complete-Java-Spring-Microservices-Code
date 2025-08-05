package CoreJava;
public class Loops {
    public static void main(String [] ar){

        // while loop
        int i=0;
        while(i<3){
            System.out.println("hiii "+i);
            i++;
        }

        // do while loop
        int j=9;
        do{
            System.out.println("hello"+j);
            j++;
        }while(j<5);

        // for loop
        for(int k=0;k<4;k++){
            System.out.println("for "+k);
        }

        System.out.println();
        //nested
        outer:
        for(int a=1;a<4;a++){
            for(int b=1;b<4;b++){
                if(b==3)break outer;
                System.out.println("a= "+a+", b= "+b);
            }
            System.out.println("----");
        }
    }
    
}

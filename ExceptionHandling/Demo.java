public class Demo {
    public static void main (String [] args){
        int i=3;
        int j=0;

        int nums[]=new int[5];


        try{
            j=16/i;
            System.out.println(nums[1]);
            System.out.println(nums[5]);

        }catch(ArithmeticException e){
            System.out.println("cant divde by 0");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("index is out of bound");
        }
        System.out.println(j);
        System.out.println("bye");
    }
    
}

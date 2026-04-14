package CoreJava.Array;

public class Demo {
    public static void main(String[] ar) {

        int nums[] = { 3, 7, 2, 4 };

        nums[1] = 6;
        System.out.println(nums[1]);

        int num[] = new int[4];
        System.out.println(num[2]);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println();

        // int random=(int)(Math.random()*100);


        int arr[][] = new int[3][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=(int)(Math.random()*10);
            }
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        for(int n[]:arr){
            for(int m : n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }

}

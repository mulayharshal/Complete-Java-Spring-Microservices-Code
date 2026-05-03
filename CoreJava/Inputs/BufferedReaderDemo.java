import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

    public static void main(String arg[]) throws IOException{
        System.out.println("Enter a number");

        InputStreamReader in= new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(in);

        int num= Integer.parseInt(bf.readLine());
        System.out.println(num);

        bf.close();
    }
    
}

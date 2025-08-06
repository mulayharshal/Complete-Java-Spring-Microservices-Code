package CoreJava.OOP;

class Computer{
    public void playMusic(){
        System.out.println("Music Playing...");
    }

    public String getMePen(int cost){
        if(cost>=10){
            return "pen";
        }else{
            return "nothing";
        }
    }
}

public class Object1 {
    public static void main(String a[]){

        Computer obj=new Computer();
        obj.playMusic();
        String str=obj.getMePen(10);
        System.out.println(str);

    }
    
}

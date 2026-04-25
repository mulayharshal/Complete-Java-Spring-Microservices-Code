enum Status{
    Running, Failed, Pending, Success;
}
public class Enums {
    public static void main(String []arg){

        Status s=Status.Running;

        if(s==Status.Running)
            System.out.println("All Good");
        else if(s==Status.Failed)
            System.out.println("Try again");
        else if(s== Status.Pending)
            System.out.println("Please Wait");
        else
            System.out.println("Done");
    }
    
}

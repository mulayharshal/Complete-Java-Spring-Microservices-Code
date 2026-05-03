public class CustomException {

   
    public static void main(String a[]){
        int i=20;
        int j=0;

        try{
            j=18/i;
            if(j==0){
                throw new HarshalException("Dont want zero");
            }
        }catch(HarshalException e){
            j=18/1;
            System.out.println("the default way  "+e);
        }catch(Exception e){
            
        }
        System.out.println(j);
    }
    
}

 class HarshalException extends Exception{
        public HarshalException(String string){
            super(string);
        }

    }
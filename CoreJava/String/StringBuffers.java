package CoreJava.String;

public class StringBuffers {
    public static void main(String a[]){
        StringBuffer sb=new StringBuffer("Harshal");
        System.out.println(sb.capacity());

        sb.append(" Mulay");
        sb.insert(8, "Java ");
        sb.setLength(50);
        System.out.println(sb);

        String str=sb.toString();
    }
    
}

package CoreJava.OOP;

public class ObjectClass {
    public static void main (String a[]){

        Laptop obj1=new Laptop();
        obj1.model="Lenovo yoga";
        obj1.price=1000;
        System.out.println(obj1.toString());

        Laptop obj2= new Laptop();
        obj2.model="Lenovo yoga";
        obj2.price=1000;
        System.out.println(obj2.toString());

        boolean result=obj1.equals(obj2);
        System.out.println(result);
        System.out.println();
        System.out.println(obj1.getClass());
    }
    
}
class Laptop{
    String model;
    int price;

    // public String toString(){
    //     return model+" : "+price;
    // }

    // public boolean equals(Laptop that){
    //     return this.model.equals(that.model) && this.price==that.price;
    // }


    
    

    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }


    
}

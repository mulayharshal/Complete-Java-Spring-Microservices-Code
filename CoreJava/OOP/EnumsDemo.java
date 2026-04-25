enum Laptop{
    Mackbook(2000), XPS(2200), Surface(1500), ThinkPad(1800);

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}

public class EnumsDemo {
    public static void main (String[] arg){


        for(Laptop lap: Laptop.values()){
            System.out.println(lap+" : "+lap.getPrice());
        }

    }
    
}

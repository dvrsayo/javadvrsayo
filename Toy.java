public class Toy {
    String name;
    String brand;
    float price;
    int quantity;

    void setPrice(float price)
        {
            this.price = price;
        }
    
    public static void main(String[] args) {
        Toy toy1 = new Toy();
        toy1.name = "Burrito";
        toy1.brand = "petoy";
        toy1.price = 150f;
        toy1.quantity = 20;
        toy1.setPrice((toy1.price*0.5f));
        System.out.println(toy1.price);
    }

    
}

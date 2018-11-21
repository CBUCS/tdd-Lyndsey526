/*
Lyndsey Wilson
ID#684781

 */
public class BasketTest {
    public BasketTest() {
    }

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addToBasket(new Apple());
        basket.addToBasket(new Apple());
        System.out.println("Total Price: " + basket.getTotalPrice());
    }
}


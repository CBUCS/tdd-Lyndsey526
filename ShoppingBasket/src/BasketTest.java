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
        basket.addToBasket(new Carrot());
        basket.addToBasket(new Corn());
        basket.addToBasket(new Corn());
        basket.addToBasket(new Corn());
        basket.addToBasket(new Watermelon());
        basket.addToBasket(new Watermelon());
        basket.addToBasket(new Watermelon());
        basket.addToBasket(new Watermelon());
        basket.addToBasket(new Watermelon());
        System.out.printf("Total Price: $%.2f\n", basket.getTotalPrice());
        System.out.printf("Total Weight: %.2f lb(s)\n\n", basket.getTotalWeight());
        basket.getBasketList();
    }
}


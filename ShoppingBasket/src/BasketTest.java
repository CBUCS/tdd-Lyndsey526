/*
Lyndsey Wilson
ID#684781

 */
public class BasketTest
{
    public static void main(String args[])
    {
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
        System.out.println("Total Price: " + basket.getTotalPrice());
        System.out.println("Total Weight: " + basket.getTotalWeight());
        basket.getBasketList();
    }
}


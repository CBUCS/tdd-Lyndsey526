/*
Lyndsey Wilson
ID#684781

 */
public class Watermelon extends Fruit implements Visitable
{
    @Override
    public String getName()
    {
        return "Watermelon";
    }

    @Override
    public double getPrice()
    {
        return 4.99;
    }

    public double getWeight()
    {
        return 3.25;
    }
}


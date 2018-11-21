/*
Lyndsey Wilson
ID#684781

 */
public class Carrot extends Vegetable implements Visitable
{
    @Override
    public String getName()
    {
        return "Carrot";
    }

    @Override
    public double getPrice()
    {
        return 1.49;
    }

    public double getWeight()
    {
        return 0.65;
    }
}

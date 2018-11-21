/*
Lyndsey Wilson
ID#684781

 */
public class Corn extends Produce implements Visitable
{
    @Override
    public String getName()
    {
        return "Corn";
    }

    @Override
    public double getPrice()
    {
        return 2.29;
    }

    public double getWeight()
    {
        return 1.15;
    }
}

/*
Lyndsey Wilson
ID#684781

 */
import java.util.ArrayList;

public class Basket implements Visitor {
    private ArrayList<Produce> list = new ArrayList();

    public Basket() {
    }

    public void addToBasket(Produce p) {
        this.list.add(p);
    }
    public double getTotalWeight() {
        double total = 0.0D;

        for(int i = 0; i < this.list.size(); ++i) {
            total += ((Produce)this.list.get(i)).accept(this, 0);
        }

        return total;
    }
    public double getTotalPrice()
    {
        double total = 0.0;
        for(int i = 0; i < list.size(); i++)
            total += list.get(i).accept(this, 1);
        return total;
    }

    public String getBasketList()
    {
        String sList = "Basket:\n";
        for(int i = 0; i < list.size(); i++)
            sList += list.get(i).accept(this, 2);
        return sList;
    }
    public double visitPrice(Produce p) {
        return p instanceof Apple ? ((Apple)p).getPrice() : 0.0D;
    }

    public double visitWeight(Produce p) {
        return p instanceof Apple ? ((Apple)p).getWeight() : 0.0D;
    }
}
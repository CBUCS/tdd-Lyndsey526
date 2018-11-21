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

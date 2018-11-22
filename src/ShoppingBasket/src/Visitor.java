package ShoppingBasket.src;

/*
Lyndsey Wilson
ID#684781

 */
public interface Visitor {
    double visitWeight(Produce var1);

    double visitPrice(Produce var1);

    String visitNames(Produce var1);
}



/*
Lyndsey Wilson
ID#684781

 */
public class Produce implements Visitable {
    protected String name;
    protected double price;
    protected double weight;

    public Produce() {
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public double getWeight() {
        return this.weight;
    }

    public double accept(Visitor v, int type) {
        switch(type) {
            case 0:
                return v.visitWeight(this);
            case 1:
                return v.visitPrice(this);
            case 2:
                System.out.println(v.visitNames(this));
            default:
                return 0.0D;
        }
    }
}
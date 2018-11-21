/*
Lyndsey Wilson
ID#684781

 */
public class Produce implements Visitable {
    protected String name;
    protected double price;
    protected double weight;
    protected int quantity;

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
    public int getQuantity() {
        return this.quantity;
    }
    public double accept(Visitor v, int type) {
        return type == 0 ? v.visitWeight(this) : v.visitPrice(this);
    }
}
package product;

public class _product {
    static int counter = 0;
    public String name;
    public int id;
    public double quantity;
    public double price;
    public double profit;

    public _product(String name,double quantity, double price,double profit){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.profit = profit;
        counter += 1;
        this.id = counter;
    }
    public String toString()
    {
        return name + " " + price;
    }

    public static void main(String[] args) {
        
    }
}


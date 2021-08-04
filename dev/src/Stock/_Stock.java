package Stock;
import java.util.HashMap;
import java.util.Map;

import product.*;
public class _Stock {
    HashMap<String,_product> hash = new HashMap<>();
    public void add_stock(String name,double quantity, double price,double profit)
    {
        if(hash.containsKey(name))
        {
            hash.get(name).quantity += quantity;
            hash.get(name).price += price;
            hash.get(name).profit += profit;
        }
        else
        {
            hash.put(name , new _product(name, quantity, price, profit));
        }
    }
    public void _display()
    {
        for(Map.Entry<String,_product> x : hash.entrySet())
        {
            System.out.println(x.getValue());
        }    
        
    }


    public static void main(String[] args)
    {
        _Stock obj= new _Stock();
        obj.add_stock("atta",10.0,50.0,20.0);
        obj._display();


    }
    
}

// Name, quantity,price

package Stock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    public double consume_stock(String name, double quantity){
        if(hash.containsKey(name) && hash.get(name).quantity>0){

            if(hash.get(name).quantity < quantity){
                double price = hash.get(name).quantity * hash.get(name).price * (1+(hash.get(name).profit/100));
                hash.get(name).quantity = 0;
                return price;
            }
            else{
                double price = quantity * hash.get(name).price * (1+(hash.get(name).profit/100));
                hash.get(name).quantity -= quantity;
                return price;
            }
        }
        else{
            System.out.println("Stock not Available");
            return 0;
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
        obj.add_stock("rice",0,100.0,15.0);
        obj.add_stock("corn",10.0,30.0,5.0);
        obj.add_stock("haldi",10.0,20.0,10.0);
        obj._display();
        double price = obj.consume_stock("rice",10);
        System.out.println(price);


    }
    
}


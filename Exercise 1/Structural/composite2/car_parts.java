package composite2;

import java.util.*;

interface car_components{
    public void  showPrice();
}

class car_leaf implements car_components{
    String name;
    int price;

    public car_leaf(int price,String name){
        this.name=name;
        this.price=price;      
    }

    public void showPrice(){
        System.out.println(name + "  " + price);
    }
}

class car_composite implements car_components{
    String name;
    int price;

    List<car_components> car_components = new ArrayList<>();

    public car_composite(String name){
        this.name = name;
    }

    public void addcarcomponent(car_components com){
        car_components.add(com);
    }

    public void showPrice(){
        System.out.println(this.name);
        for(car_components c : car_components){
            c.showPrice();
        }
    }
    public class car_parts{
        
    }
}

package facade2;

public class M5 implements bmw{

    public String specifications;

    public void carSpecs(String itemRequired){
        specifications = "All About M5 :- " + itemRequired;
    }

    public String getCar(){
        return specifications;
    }
    
}

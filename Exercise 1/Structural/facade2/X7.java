package facade2;

public class X7 implements bmw{
    
    public String specifications;

    public void carSpecs(String itemRequired){
        specifications = "All About X7 :- " + itemRequired;
    }

    public String getCar(){
        return specifications;
    }
}

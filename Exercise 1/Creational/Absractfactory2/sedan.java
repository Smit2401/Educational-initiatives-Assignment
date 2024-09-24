package Absractfactory2;

public class sedan extends carAbstractfactory {
    @Override
    public car getCar(String carType){    
       if(carType.equalsIgnoreCase("BMW_M5")){
          return new BMW_M5();         
       }else if(carType.equalsIgnoreCase("E_class")){
          return new E_class();
       }	 
       return null;
    }
}

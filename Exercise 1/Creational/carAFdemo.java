import Absractfactory2.*;

public class carAFdemo {
    
    public static void main(String[] args) {
       
        carAbstractfactory offroadcar = carfactoryproducer.getcarFactory(false);
        car car1 = offroadcar.getCar("Rangerover");
        car1.sel();
        car car2 = offroadcar.getCar("G63");
        car2.sel();
        carAbstractfactory sedan = carfactoryproducer.getcarFactory(true);
        car car3 = sedan.getCar("BMW_M5");
        car3.sel();
        car car4 = sedan.getCar("E_class");
        car4.sel();
           
        }
}

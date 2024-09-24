package Absractfactory2;

public class offroadcar extends carAbstractfactory {
    @Override
    public car getCar(String carType) {
        if (carType.equalsIgnoreCase("G63")) {
            return new G63();
        } else if (carType.equalsIgnoreCase("Rangerover")) {
            return new Rangerover();
        }
        return null;
    }
}

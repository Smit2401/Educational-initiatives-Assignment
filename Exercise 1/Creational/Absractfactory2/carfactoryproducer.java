package Absractfactory2;

public class carfactoryproducer {
    public static carAbstractfactory getcarFactory(boolean speed) {
        if (speed) {
            return new sedan();
        } else {
            return new offroadcar();
        }
    }
}

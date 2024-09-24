package state2;


public class Feature_main {
    public static void main(String[] args) {
        cornering_foglamp fogLight = new cornering_foglamp();

        left_indicator li = new left_indicator();
        li.doAction(fogLight);
        System.out.println(fogLight.getDirection().toString());

        right_indicator ri = new right_indicator();
        ri.doAction(fogLight);
        System.out.println(fogLight.getDirection().toString());

    }
}

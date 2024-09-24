package state2;

public class right_indicator implements Direction {
    public String toString() {
        return "Right Indicator is Blinking";
    }

    @Override
    public void doAction(cornering_foglamp context) {
        System.out.println("Right Fog light turned On!");
        context.setDirection(this);
    }
}

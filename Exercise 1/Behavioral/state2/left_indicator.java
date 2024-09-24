package state2;

public class left_indicator implements Direction {
    
    public String toString(){
        return "Left Indicator is Blinking";
    }

    @Override
    public void doAction(cornering_foglamp context) {
        System.out.println("Left Fog light turned On!");
        context.setDirection(this);	
    }
}

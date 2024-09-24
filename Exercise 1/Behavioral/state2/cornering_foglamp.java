package state2;

public class cornering_foglamp {
    private  Direction direction;

    public cornering_foglamp(){
        direction = null;
    }

    public void setDirection(Direction direction){
        this.direction=direction;
    }

    public Direction getDirection(){
        return direction;
    }
}

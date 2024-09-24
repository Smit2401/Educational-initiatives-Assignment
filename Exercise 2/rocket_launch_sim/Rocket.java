import java.util.logging.Logger;
public class Rocket {
    public String stage;
    public int fuel;
    private int altitude;
    private int speed;
    private RocketState state;
    private Logger logger = Logger.getLogger(Rocket.class.getName());

    public Rocket() {
        this.state = new PreLaunch();
    }

    public void updateRocketState(int time) {
        if (fuel <= 0) {
            if(this.stage!="Orbit Achieved"){

            System.out.println("Mission Failed due to insufficient fuel.");
            return;
            }
        }

        if(stage.equals("Stage 1")){
            fuel -= time * 3;
        }
        else if(stage.equals("Stage 2")){
            fuel -= time*1;
        }

        altitude += time * 10;
        speed += time * 50;
        if(fuel>0){
        System.out.println("Stage: " + stage + ", Fuel: " + fuel + "%, Altitude: " + altitude + " km, Speed: " + speed + " km/h");}

        if (altitude >= 300) {
            if(this.stage =="Stage 1"){
            System.out.println("Stage 1 complete. Separating stage. Entering Stage 2.");}
            stageSeparation();
        } 
        if (altitude >= 500) {
            System.out.println("Orbit achieved! Mission Successful.");
            orbitAchieved();
        }
        if (fuel <= 0) {
            if(this.stage!="Orbit Achieved"){
            logger.severe("Mission failed due to insufficient fuel.");
            System.out.println("Mission Failed due to insufficient fuel.");}
            else{
                System.out.println("Mission Successfull!");
            }
        }
    }

    private void stageSeparation() {
        this.stage = "Stage 2";
    }

    private void orbitAchieved() {
        this.stage = "Orbit Achieved";
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setState(RocketState state) {
        this.state = state;
    }

    public void start() {
        state.handle(this);
    }
}

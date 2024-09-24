public class PreLaunch implements RocketState {
    @Override
    public void handle(Rocket rocket) {
        rocket.setFuel(100);
        rocket.setAltitude(0);
        rocket.setSpeed(0);
        rocket.setStage("Pre-Launch");
        System.out.println("All systems are 'Go' for launch.");
    }
}

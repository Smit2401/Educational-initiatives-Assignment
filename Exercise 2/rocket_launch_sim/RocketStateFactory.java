public class RocketStateFactory {
    public static RocketState getState(String command) {
        switch (command) {
            case "start_checks":
                return new PreLaunch();
            case "launch":
                return new Launch();
            default:
                throw new IllegalArgumentException("Invalid command");
        }
    }
}

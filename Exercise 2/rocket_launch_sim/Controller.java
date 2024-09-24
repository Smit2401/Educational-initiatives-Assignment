public class Controller {
    private Rocket rocket;
        public Controller() {
            this.rocket = new Rocket();
        }
        public void executeCommand(String command) {
            try {
                if (command.startsWith("fast_forward")) {
                    String[] x = command.split(" ");
                    int seconds = Integer.parseInt(x[1]);
                    fastForward(seconds);
                } else {
                    RocketState state = RocketStateFactory.getState(command);
                    rocket.setState(state);
                    rocket.start();
                }
            } catch (Exception e) {
                System.out.println("Invalid command!");
            }
        }
    
        private void fastForward(int seconds) {

            rocket.setStage("Stage 1");
            System.out.println("Fast forwarding " + seconds + " seconds...");
            for (int i = 1; i <= seconds; i++) {
                if(rocket.fuel>0 && rocket.stage !="Orbit Achieved" ){
                    rocket.updateRocketState(i);
                 }
                 else if(rocket.fuel<=0 && rocket.stage !="Orbit Achieved"){
                     break;
                 }
                 if(rocket.stage=="Orbit Achieved"){
                     break;
                 }
            }


        }
    
}

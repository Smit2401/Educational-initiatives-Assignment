public class Launch implements RocketState {
    @Override
    public void handle(Rocket rocket) {
        System.out.println("Launch started...");
        rocket.setStage("Stage 1");
        
        for (int i = 1; i <= 50; i++) {
            if(rocket.fuel>0 && rocket.stage !="Orbit Achieved" ){
               rocket.updateRocketState(i);
            }
            else if(rocket.fuel<=0 && rocket.stage !="Orbit Achieved"){
                break;
            }
            if(rocket.stage=="Orbit Achieved"){
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Launch interrupted.");
                Thread.currentThread().interrupt(); 
                break; 
            }
        }

    }
}

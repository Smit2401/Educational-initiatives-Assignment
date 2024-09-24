package Observer2;


public class Car {
    public static void main(String[] args) {
                
        ECU e= new ECU();
        
        Owner s1 = new Owner("RSA");
        Owner s2 = new Owner("Smit's iDrive account");
        Owner s3 = new Owner("Infotainment");

        e.displayto(s1);
        e.displayto(s2);
        e.displayto(s3);
        s1.partdameged(e);
        s2.partdameged(e);
        s3.partdameged(e);
        
        e.warning("Petrol pipe damaged!");
        
        System.out.println("\n");
        e.warning("Engine Damaged!");
        System.out.println("\n");
        e.warning("Oil is leakaging!");
    }
}

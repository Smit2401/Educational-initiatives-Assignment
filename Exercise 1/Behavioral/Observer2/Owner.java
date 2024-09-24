package Observer2;

public class Owner implements observer {
    private String name;
    private ECU e = new ECU();
    
    
    public Owner(String name){
        this.name = name;
    }

    public void update(){
        System.out.println("Massage passed to " + name + ": Failure Occurs :" + e.title);
    }

    public void partdameged(ECU part){
        e = part;
    }
}

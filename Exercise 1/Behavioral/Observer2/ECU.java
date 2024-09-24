package Observer2;
import java.util.ArrayList;
import java.util.List;

public class ECU implements  subject {
    private List<Owner> owners=new ArrayList<Owner>();
    public String title;
    @Override
    public void displayto(Owner o) {
        owners.add (o);
    }
    public void notifyOwner(){
        for(observer observer:owners){
            observer.update();
        }
    }
    @Override
    public void warning(String title) {
        this.title=title;
        notifyOwner();
    } 
}

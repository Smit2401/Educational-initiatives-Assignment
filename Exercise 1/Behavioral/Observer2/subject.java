package Observer2;

public interface subject {

    void displayto(Owner o);
    void notifyOwner();
    void warning(String title);
}

package single_2;

public class singleton_2 {
    private static singleton_2 soleInstance = new singleton_2();
    public int i;

    private singleton_2() {
        System.out.println("Sports varients");
    }

    public static singleton_2 getInstance() {
        return soleInstance;
    }

    public int getI() {
        return i;
    }

    public static void setSoleInstance(singleton_2 soleInstance) {
        singleton_2.soleInstance = soleInstance;
    }

    public void setI(int i) {
        this.i = i;
    }
}

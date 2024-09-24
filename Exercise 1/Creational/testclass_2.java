import single_2.singleton_2;

public class testclass_2 {
    static void print(String name, singleton_2 obj) {
        System.out.println(String.format("Object : %s , Hashcode : %d", name, obj.hashCode()));
    }

    public static void main(String[] args) {
        singleton_2 s1 = singleton_2.getInstance();
        singleton_2 s2 = singleton_2.getInstance();
        s1.setI(550);
        s2.setI(456);
        System.out.println(s1.getI());
        s2.i = s1.i + s2.i;
        System.out.println(s2.getI());
        print("BMW M8 compitition", s1);
        print("Mercedes AMG C63", s2);
    }

}

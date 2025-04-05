package collections;

public class StaticExample {
    public static int count = 0; // Static variable

    StaticExample() {
        count++;  // Increments count whenever a new object is created
    }

    Integer m1() {
        System.out.println("Count: " + count);
        return 1;
    }

    void m2() {
        System.out.println(" instaces count");
    }

    public static void main(String args[]) {
        StaticExample g1 = new StaticExample();
        StaticExample g2 = new StaticExample();

        System.out.println(g1.m1());
        g2.m2();


    }
}

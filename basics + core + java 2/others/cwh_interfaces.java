
interface bicycle {
    int a =45;

    void applybrake(int decrement);

    void speedup(int increment);
}

class Avoncycle implements bicycle {
    void vlow() {
        System.out.println("pee pee poo");
    }

    public void applybrake(int decrement) {
        System.out.println("apply break");
    }

    public void speedup(int increment) {
        System.out.println("apply speed");
    }

}

public class cwh_interfaces {
    public static void main(String[] args) {
   Avoncycle c = new Avoncycle();
   c.applybrake(1);
   System.out.println(c.a);
    }
}

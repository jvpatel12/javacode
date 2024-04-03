
interface sampleInterfaces {
    void math1();

    void math2();

}

interface childinterfaces extends sampleInterfaces {

    void math3();

    void math4();

}

class sampleclass implements childinterfaces {

    public void math1() {
        System.out.println("j");
    }

    public void math2() {
        System.out.println("e");
    }

    public void math3() {
        System.out.println("e");
    }

    public void math4() {
        System.out.println("l");
    }

}

public class interfaces1 {
    public static void main(String[] args) {
        sampleclass s=new sampleclass();
        s.math1();
        s.math2();
        s.math3();   
        s.math4();
    }

}
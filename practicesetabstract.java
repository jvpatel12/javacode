

abstract class pen{
    abstract void write();
    abstract void refill();
}
  class fountainpen extends pen{
    void write(){
      System.out.println("write");
    }
    void refill(){
       System.out.println("refill");
    }
    void changeNib(){
        System.out.println("changing the nib");
    }

  }

public class practicesetabstract {
    public static void main(String[] args) {
      
        fountainpen s =new fountainpen();
        s.changeNib();
    }
}

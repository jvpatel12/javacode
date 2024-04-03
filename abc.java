import java.util.*;

abstract class Base{
    public Base(){
        System.out.println("i am jeel");
    }
    public void hello(){
        System.out.println("hello jeel ");
    }
    abstract public void jeel();
}
   class  dhruv extends Base{
    public void jeel(){
        System.out.println("good morning");
   
    }

    abstract class jeel1 extends Base{
        public void run(){
            System.out.println("i am patel");
        }
    }
   }

public class abc{
    public static void main(String[] args) {
       
        dhruv s= new dhruv();
        s.hello();
        s.jeel();
    }
}

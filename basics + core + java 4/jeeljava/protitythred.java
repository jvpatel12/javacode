import java.util.*;

class j extends Thread{
public void run(){
   System.out.print("jeel.."+Thread.currentThread().getName());
}
}



public class protitythred{
    public static void main(String args[]){
       j obj =new j();
      j obj1=new j();
     j obj2=new j();
    
       System.out.print("jeel patel.."+Thread.currentThread().getName());
       obj.setPriority(10);
      obj1.setPriority(2);
      obj2.setPriority(3);
    System.out.print(obj.getPriority());
    System.out.println(obj.getName());
    System.out.println(obj.getId());
    System.out.print(obj1.getPriority());
    System.out.println(obj1.getName());
    System.out.println(obj1.getId());
    System.out.print(obj2.getPriority());
    System.out.println(obj2.getName());
    System.out.println(obj2.getId());
    obj.start();
     obj1.start();
      obj2.start();
    }
}

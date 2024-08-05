 
 class je implements Runnable{
     public void run(){
        System.out.println("p");
     }
    }
    public class jeel{
    public static void main(String[] args) {
         je o=new je();
         Thread t=new Thread(o);
         t.start();
    }
}

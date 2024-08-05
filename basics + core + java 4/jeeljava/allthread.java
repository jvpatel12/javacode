
    class Test extends Thread{
        public void run(){
        System.out.println("running...");
        }
    }
        public class allthread{
        public static void main(String args[]){
        Test t1=new Test ();
        Test t2=new Test ();
        System.out.println("Name of t1:"+t1.getName());
        System.out.println("Name of t2:"+t2.getName());
        System.out.println("id of t1:"+t1.getId());
        
        t1.start();
        t2.start();
            t1.setName("jeel");;
System.out.println("After changing name of t1:"+t1.getName());
}
        }
    


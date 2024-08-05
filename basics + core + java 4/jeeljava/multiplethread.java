class m extends Thread{
    public void jeel(){
     for(int i=0;i<5;i++){
        System.out.println("jeel");
     }
     try{
        Thread.sleep(4);
     }catch(InterruptedException e){
        e.fillInStackTrace();
     }
    }
}
class c extends Thread{
     public void p(){
        System.out.println("jeel");
     }
}


public class multiplethread {
    public static void main(String[] args) {
        m obj=new m();
        c obj1=new c();
        obj.start();
        obj1.start();
    }
}

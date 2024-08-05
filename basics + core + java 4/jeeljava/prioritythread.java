class p extends Thread
{
    public p(String s){
      super(s);
    }
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"patel"+i);
        }
    }
}
public class prioritythread {
    public static void main(String[] args) {
        p t=new p("jeel 1");
        p t1=new p("jeel 2");

        t.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MAX_PRIORITY);

        t.start();
        t1.start();
    }
}

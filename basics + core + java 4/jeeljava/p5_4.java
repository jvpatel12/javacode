

    interface jeel{
        abstract void me();
    }
    interface jeel1{
        abstract void you();
    }

   class p implements jeel,jeel1{
        public void me(){
            System.out.println("patel");
        }
       public  void you(){
            System.out.println("jeel");
        }
    }
    public class p5_4 {
    public static void main(String[] args) {
          p s=new p();
          s.me();
          s.you();

    }
}

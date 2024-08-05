interface jeel{
     void jeel12();
    static void jeel123(){
        System.out.println("patel");
    }
    default void j(){
        System.out.println("patel12");
    }
}
  class b implements jeel
{
    public void jeel12(){
     System.out.println("jeel");
    }
    
}

public class interfaces {
   public static void main(String[] args) {
    b n= new b();
    n.jeel12();
    n.j();     
   }
}

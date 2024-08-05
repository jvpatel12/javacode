class p extends Exception{
    public  p(String s){
        super(s);
    }
}

class p6_31 {

     static int cb=5000;
     public static void ed(int a) throws Exception{
        int nb=cb-a;

        if(nb>1000){
            throw new p("jeel");
        }
     }
     public class p6_3 {
     
        
     
    public static void main(String[] args) {
        try{
            int a=Integer.parseInt(args[0]);
            ed(a);
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}}
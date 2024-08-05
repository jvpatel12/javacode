import java.util.Scanner;


      class Area{
       
        void area( int l,int b){
             Double answer;
        
               answer=(0.5*l*b);
               System.out.println("triangle"+answer);
        }
         void area(int l){
             Double answer;
        
            answer=3.14*l*l;
            System.out.println("circle"+answer);
        }
         void area(int l,int b,Double h){
             Double answer;
        Double answer1;
            answer=(double) (2 *( l + b));
            answer1=l*b*h;
            System.out.println("rect"+answer);
            System.out.println("volumr"+answer1);
        }
        
        void area(Double l){
             Double answer;
       
        
            answer=4*3.14*(l*l);
            System.out.println("sphere"+answer);
        }
      }
     public class p4_7 {
     
        
     
   
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    
        Area pp=new Area();
        int l=sc.nextInt();
        int b=sc.nextInt();
        Double h=sc.nextDouble();

        pp.area(l, b);
        pp.area(l);
        pp.area(l, b, h);
        pp.area(h);
    }
}

import java.util.*;


     class student {
        int roll, age;
        Double height, weight, contct;

       

     public void set_info(int r, int a, Double h, Double w, Double c) {
            roll = r;
            age = a;
            height= h;
            weight = w;
            contct= c;
        }

        

        void get_info(){
        System.out.println("rool"+ roll+"age" + age+"height" + height +"weight"+ weight+"con" + contct);
        }



        

    }
    public class p4_3 {
    
        
    
    public static void main(String[] args) {
    Scanner sc=new  Scanner(System.in);
   student s= new student();
    int r=sc.nextInt();
    int a=sc.nextInt();
    Double h=sc.nextDouble();
    Double w=sc.nextDouble();
    Double c=sc.nextDouble();
     s.set_info(r,a,h,w,c);
     s.get_info();
    

}
    }
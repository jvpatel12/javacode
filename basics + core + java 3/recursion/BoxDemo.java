import java.util.Scanner;

import javax.swing.Box;

class box {
    double length;
    double  height;
    double width;

    public box(double length,double  height,double width){
        this.length=length;
        this. height= height;
        this.width=width;
    }

    public double findvolume(double length,double  height,double width){
        return length* height*width;
    }
    public double get_length(){
        return length;
    }
    public double get_height(){
        return  height;
    }
    public double get_width(){
        return width;
    }
}
   public class BoxDemo{
 
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your length");
        Double  length= sc.nextDouble();

        System.out.println("enter your  height");
        Double   height= sc.nextDouble();

        System.out.println("enter your width");
        Double  width= sc.nextDouble();
        
      box s = new box(length,  height ,width);

      double value = s.findvolume(length,height,width);
      System.out.println(value);

     }
}

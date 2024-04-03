import java.util.Scanner;
class worker{
  String name;
  int Basic;
   worker(String name ,int Basic){
     this.name =name;
     this.Basic=Basic;
   }
  void display(){
     System.out.println("name "+ name + "\n" + "basic "+Basic);
  }
}
class Wages extends worker{
  int hrs;
  int rate;
  int wage;
   Wages(int h,int r,int w,String n,int B){
    super(n, B);
    this.hrs=h;
    this.rate=r;
    this.wage=w;
    this.name=n;
    this.Basic=B;
   }
  double overtime(){
      double amount= (hrs*rate);
     return amount;
  }
  void display(){
      double amount;
      wage= (hrs *rate)+ Basic;
      System.out.println(wage);
  }
}
public class jeel123{
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        int Basic=sc.nextInt();
          int hrs=sc.nextInt();
         int rate=sc.nextInt();
         int wage=sc.nextInt(); 
         
         worker s=new worker(name, Basic);
        
         Wages n=new Wages(hrs, rate, wage, name, Basic);
        
         s.display();
          n.display();

     }
}

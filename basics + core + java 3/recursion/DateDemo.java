 class Date{
  int day;
  int month;
  int year;

 public  void set_date(int day,int month,int year){
    this.day = day;
    this.month =month;
    this.year = year;
  }
  public void  get_date(){
      System.out.println("day :"+ day + "month :"+ month + "year :" + year);
  }
 }
 public class DateDemo{
  
 public static void main(String[] args) {
   Date  s= new Date();
   int day = 10;
   int month = 01;
   int year = 2023;

   s.set_date(day,month,year);
   s.get_date();    
}
 }
  

import java.util.Scanner;

//given two numbers x and y find the greatest common divisor of x and y 
//0<=x ,y<=1e6
//x=4,y=9
//1



public class recursion5 {

    //GCD BASICS PROBLEM
   //geater common divison   x%y==0 

   static int iGCD(int x, int y){
    while (x%y==0) {
        int rem = x%y;
        x=y;
        y = rem;
    }
    return y;
   }
    public static void main(String[] args) {
        var jeel= new Scanner(System.in);
        int x = jeel.nextInt();
        int y = jeel.nextInt();
        System.out.println(iGCD(x,y));   
    }
}

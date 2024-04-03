import java.util.Scanner;

public class recursion {
    static void printIncreasing(int n){
        if(n ==1){
           System.out.println(n);                   
           return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
      var sc= new Scanner(System.in);
        int n = sc.nextInt();
      printIncreasing(n); 
   
        }
}

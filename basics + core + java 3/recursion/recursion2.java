import java.util.Scanner;


public class recursion2 {
    
        static void printDecrsing(int n){
            if(n==1){
                System.out.println(1);
                return;
            }
            System.out.println(n);
    
            printDecrsing(n-1);
        }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecrsing(n);
      }
     }    


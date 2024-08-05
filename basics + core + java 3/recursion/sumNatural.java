import java.util.Scanner;

public class sumNatural {
     
     // n is giving 1+2+3+....+n-1+n
     //f(n) = f(n) is bigger problem = f(n-1) + n nis adding its a self work
     //f(n) = f(n-1)+n   n==0 thna time no series return is 0;

     static int seriesSum1(int n){
        if(n==0){
            return 0;
        }
       return seriesSum1(n-1) + n;
     }
     //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(seriesSum1(n));
    }
}

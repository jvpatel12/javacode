import java.util.Scanner;

public class functions4 {
    public static void printFactorial (int n ){
        if(n<1){
            System.out.println("invalid");
            return;
        }
        int Factorial = 1;
        for(int i = n; i>=1; i--){
             Factorial = Factorial*i;
        }
        System.out.println(Factorial);
        return;
    }
    public static void main (String args[]){
        Scanner sc =  new Scanner(System.in);

        int i =  sc.nextInt();
        printFactorial(i);
    }

    
}

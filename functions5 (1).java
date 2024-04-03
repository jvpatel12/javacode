import java.util.Scanner;

public class functions5 {
    public static int printAvargeValue(int a,int b,int c){
        if(a>b && a>c){
            System.out.println(" a is greater than "+ a);
        }
        else if (b>c && a>c){
            System.out.println("b is greaterthan "+b);

        }
        else{
            System.out.println("c is greathan " + c);
        }

        return (0);
    
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in );
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        printAvargeValue(a, b, c);
    }

     
}

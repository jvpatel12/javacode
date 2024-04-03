import java.util.Scanner;

public class calculator {
    public static void main ( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a : ");
        int a = sc.nextInt();
        System.out.println("enter b : ");
        int b= sc.nextInt();
        System.out.println( "enter c : ");
        char c= sc.next().charAt(0);
        
        switch (c) {
            case '+':
                System.out.println(a+b);
                break;
                case '-':
                System.out.println(a-b);
                break;
                case '*':
                System.out.println(a*b);
                break;
                case '%':
                System.out.println(a%b);
                break;
                case '/':
                System.out.println(a/b);
                break;
            default:
            System.out.println("wrong calculator");
                break;
        }
    }
    
}

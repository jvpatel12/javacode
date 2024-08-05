import java.util.Scanner;
import java.util.*;

class evenNumber extends Thread {

    private int n;

    public evenNumber(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 2; i < n; i += 2) {
            System.out.println("even number is" + i);
        }
    }
}

class oddNumber extends Thread {

    private int n;

    public oddNumber(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 1; i < n; i += 2) {
            System.out.println("odd number is" + i);
        }
    }
}

class primeNumber extends Thread {

    private int n;

    public primeNumber(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        int i, m = 0, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is prime number");
            }
            }
            System.out.println("enetr valid input");
        }
    }

public class thread {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter plz range in n");
        int n=sc.nextInt();
        evenNumber e=new evenNumber(n);
        e.start();
        oddNumber o=new oddNumber(n);
        o.start();
        primeNumber p=new primeNumber(n);
        p.start(); 
    }
}

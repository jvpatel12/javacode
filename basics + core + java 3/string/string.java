package string;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class string{
    public static void main(String args[]){
          Scanner sc  = new Scanner(System.in);
           String name;      
           
           name  = sc.nextLine();
           System.out.println(name + " ");
           System.out.println(name.length());
           System.out.println(name.charAt(0) + " ");

            }
}
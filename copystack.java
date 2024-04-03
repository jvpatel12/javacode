package stacks;

import java.util.Scanner;
import java.util.Stack;
public class copystack {
     public static void main(String[] args) {
         Scanner sc  =new Scanner(System.in); 
         Stack<Integer> s = new Stack<>();
          
         int n;
         System.out.println("enter your elements you want to insert");
        n = sc.nextInt();

        for(int i=1;i<=n;i++){
            int x = sc.nextInt();
            s.push(x);

        }
        System.out.println(s);


           Stack<Integer> gt = new Stack<>();

           while(s.size()>0){
            gt.push(s.pop());
           }
           System.out.println(gt);
           Stack<Integer> st = new Stack<>();

           while(gt.size()>0){
            st.push(gt.pop());
           }
           System.out.println(st);
     }
}

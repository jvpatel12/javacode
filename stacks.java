package stacks;

import java.util.*;
public class stacks{
   public  static class stack{
       static ArrayList<Integer> ll = new ArrayList<>();

       public static boolean isEmpty(){
      return ll.size() ==0;
       }
       public static void push(int data){
        ll.add(data);
       }
       public static int pop(){
        int top = ll.get(ll.size()-1);
        ll.remove(ll.size()-1);
        return top;
       }
       public static  int peek(){
        int top = ll.get(ll.size()-1);
        return top;
       }
    }
    public static void main(String[] args) {
        stack s =  new stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}

package stack;
import linkedlist.removetail;

import java.util.*;

// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//         this.next=next;
//     }
//}

public class stack {
    //static class stack1{
        // static ArrayList<Integer> s=new ArrayList<>();
        // public static boolean isEmpty(){
        //  return s.size()==0;
        // }
        //  static void push(int data){
        //     s.add(data);
        // }
        //   static int pop(){
        //     if(isEmpty()){
        //         return -1;
        //     }
        //    int top = s.get(s.size()-1);
        //     s.remove(s.size()-1);
        //     return top;
        // }
        //  static int peek(){
        //     if(isEmpty()){
        //         return -1;
        //     }
        //     return s.get(s.size()-1);
        // }
        //using the likedlist creating the stack
        //   static Node head=null;
        //   public static boolean isEmpty(){
        //     return head==null;
        //   }
        //   public static void push(int data){
        //     Node newNode=new Node(data);
        //     if (isEmpty()) {
        //         head=newNode;
        //       return;
        //     }
        //     newNode.next=head;
        //     head=newNode;
        //   }
        //   public static int pop(){
        //     if(isEmpty()){
        //         return -1;
        //     }
        //     int top=head.data;
        //     head=head.next;
        //     return top;
        //   }
        //   public static int peek(){
        //     return head.data;
        //   }




    public static void main(String[] args) {
        Stack<Integer>  list=new Stack<>();
        list.push(1);
        list.push(2);
        list.push(3);
        

        while (!list.isEmpty()) {
            System.out.println(list.peek());
            list.pop();
        }

    }
}

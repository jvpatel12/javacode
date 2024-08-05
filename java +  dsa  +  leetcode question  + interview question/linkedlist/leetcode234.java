package linkedlist;
class Node {
    // Data stored in the node
    int data;      
    // Pointer to the next
    // node in the list
    Node next;     

    // Constructor with both data
    // and next node as parameters
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    // Constructor with only data as
    // a parameter, sets next to null
    Node(int data) {
        this.data = data;
        this.next = null;
    }
};

public class leetcode234{
    public static Node reverseLikedlist(Node head){
      if(head==null || head.next==null){
        return head;
      } 
    Node newHead=reverseLikedlist(head.next);
    Node front=head.next;
    front.next=head;
    head.next=null;
    return newHead;
    }

    public static boolean isPalidrome(Node head){
        if(head==null && head.next==null){
            return true;
        }
        Node slow=head;
        Node fast=head;

        while (fast.next!=null && fast.next.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
      Node newHead=reverseLikedlist(slow.next);
      Node first=head;
      Node second=newHead;

      while (second!=null) {
          if(first.data!=second.data){
             reverseLikedlist(newHead);
             return false;
          }
          first=first.next;
          second=second.next;
      }
      reverseLikedlist(newHead);
      return true;
    }
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a linked list with
        // values 1, 5, 2, 5, and 1 (15251, a palindrome)
        Node head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(2);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(1);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Check if the linked list is a palindrome
        if (isPalidrome(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
        }
    }

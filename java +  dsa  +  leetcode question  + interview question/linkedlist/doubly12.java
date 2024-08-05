package linkedlist;
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data1, Node next1, Node prev1) {
        this.data = data1;
        this.next = next1;
        this.prev = prev1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.prev = null;
    }
}

public class doubly12{

    private static void print(Node head){
        while (head!=null) {
            System.out.print(head.data + " -> ");
            head=head.next;
        }
        System.out.println();
    }
    
    private static Node arrayto2DLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    private static Node deletefirst(Node head){
        if(head == null) {
            return null;
        }
        if(head.next == null) {
            return null;
        }
        Node newHead = head.next;
        newHead.prev = null;
        head.next = null;
        return newHead;
    }

    private static Node deletetail(Node head){
        if(head == null) {
            return null;
        }
        if(head.next == null) {
            return null;
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node newTail = tail.prev;
        newTail.next = null;
        tail.prev = null;
        return head;
    }

    private static Node deleteKNode(Node head, int k){
        if (head == null) {
            return null;
        }

        if (k == 1) {
            return deletefirst(head);
        }

        Node temp = head;
        int count = 1;
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            return head; // k is greater than the length of the list
        }

        if (temp.next == null) {
            return deletetail(head); // k is the last node
        }

        Node left = temp.prev;
        Node right = temp.next;

        left.next = right;
        right.prev = left;
        temp.next = null;
        temp.prev = null;

        return head;
    }
   static void deleteNode(Node temp){
    Node left=temp.prev;
    Node right=temp.next;

    if(right==null){
        left.next=null;
        temp.prev=null;
        return;
    }
    left.next=right;
    right.prev=left;
    
    temp.next=temp.prev=null;

   }
   static Node insertHead(Node head,int val){
    Node newHead=new Node(val,head,null);
    head.prev=newHead;
    return newHead;

   }

   static Node insertTail(Node head,int val){
    if(head.next==null){
        return insertHead(head, val);
    }
    Node tail=head;
    while (tail.next!=null) {
        tail=tail.next;
    }
      Node left=tail.prev;
      Node newNode=new Node(val, tail, left);
      left.next=newNode;
      tail.prev=newNode;
      return head;
    
   }

   static Node insertKth(Node head,int k,int val){
    if(k==1) {
        return insertHead(head, val);
    }
    int cnt=0;
    Node temp=head;
    while(temp!=null){
        cnt++;
        if(k==cnt){
            break;
        }
            temp=temp.next;
    }
    Node left=temp.prev;
    Node newNode = new Node(val, temp, left);
   left.next=newNode;
   temp.prev=newNode;
   return head;
}

  static void insertBeforNode(Node node,int val){
    Node left=node.prev;
    Node newNode=new Node(val, node, left);
    left.next=newNode;
    node.prev=newNode;
}


    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 4 };
        Node head = arrayto2DLL(arr);
        //head = deletefirst(head);
        //head = deletetail(head);
        //head = deleteKNode(head, 2);
        //deleteNode(head.next);
       // head=insertHead(head, 10);
       //head=insertTail(head, 10); 
       //head=insertKth(head, 3, 10);
       insertBeforNode(head.next, 20);
       print(head);
       
    }
}

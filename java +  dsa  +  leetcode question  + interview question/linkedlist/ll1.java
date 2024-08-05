package linkedlist;

class Node{
    int data;
    Node next;
    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class ll1 {


    static Node convertatoL(int arr[]){
        Node head=new Node(arr[0]);
        Node mover=head;

        for (int i = 1; i < arr.length; i++) {
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }

    static int length(Node head){
        int cnt=0;
        Node temp=head;

        while(temp!=null){
            temp=temp.next;
            cnt++;
        }
        return cnt;

    }

    //delete the node in likedlist
    private static Node removeHead(Node head){
      if(head==null) return head;

      Node temp=head;
      head=head.next;
      return head;
    }

    private static Node removeTail(Node head){
        if(head==null || head.next==null) return null;

        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
     

    private static void print(Node head){
        while(head!=null){
            System.out.print(head.data + "->");
            head=head.next;
        }
        System.out.println();
    }
    static Node delete(Node head,int k){
        if(head==null) return head;

        if(k==1) {
            Node temp=head;
            return head;
        }

        int cnt=0;
        Node prev=null;
        Node temp=head;

        while (temp!=null) {
            cnt++;
            if(k==cnt){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int arr[]={0,2,3,4};
        // Node y=new Node(arr[3]);
        // System.out.println(y.data);
        // System.out.println(y.next);

        Node head=convertatoL(arr);
        //System.out.println(head.data);
    print(head);
        //travsaal in likedlist

        // Node temp1=head;
        // while (temp1!=null) {
        //     System.out.print(temp1.data + " -> ");
        //     temp1=temp1.next;
        // }

     //find the length
    //   System.out.println();
    //  int ans=length(head);
    //  System.out.print(ans);

     //delete node for linked list
     //head=removeHead(head);
      //head=removeTail(head);

     //print(head);
     //print(head);

     head=delete(head, 3);
     print(head);
    }
}

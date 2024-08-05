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
};

public class removetail {

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
    private static void print(Node head){
        while(head!=null){
            System.out.print(head.data + "->");
            head=head.next;
        }
        System.out.println();
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
     
    private static Node delete(Node head,int k){
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
        int arr[]={1,2,3,4,6,7};
        Node head=convertatoL(arr);
        head=removeTail(head);
        print(head);
        head=delete(head, 3);
        print(head);
    }
}

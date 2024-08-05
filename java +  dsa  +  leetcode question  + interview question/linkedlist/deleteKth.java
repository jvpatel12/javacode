package linkedlist;
class Node{
    int data;
    Node next;
    Node(int data,Node next){
        this.data=data;
        this.next=null;
    }
}
public class deleteKth {

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
        
    }
}

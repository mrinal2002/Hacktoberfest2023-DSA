class Node{
    int data;
    Node next;
    public Node(int x){
        data=x;
        next=null;
    }
}
public class LinkedList {
    static Node head=null;
    public static void insertAtBegin(int x){
      Node current=new Node(x);
      current.next=head;
      head=current;
    }
    public static void traverse(){
        Node current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    public static void main(String[] args) {
        // Node head=null;
        // head=new Node(4);
        // head.next=new Node(2);
        // head.next.next=new Node(6);
        insertAtBegin(3);
        insertAtBegin(1);
        insertAtBegin(6);
        traverse();
    }
}

package LinkedList;
import java.util.*;
class Node {
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SinglyLL{
    public static void Traversal(Node head){
      while(head!=null){
        System.out.print(head.data+" ");
        head=head.next;
      }
    }
    public static void traversal(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        traversal(head.next);
    }
    public static void search(Node head,int s){
        int i=1;
        while(head!=null){
            if(head.data!=s){
                
           i++;
            }
else{
    System.out.print("found at" +i);
}
            head=head.next;
        }
        System.out.print("Not found");
    }
    public static void count(Node head){
        int c=0;
        while(head!=null){
c++;
head=head.next;
        }
        System.out.print("length is "+c);
    }
    public static Node insertAtStart(Node head,int val){
        Node newNode=new Node(val);
        newNode.next=head;
return newNode;

    }
    public static Node insertAtEnd(Node head, int val) {
    Node newNode = new Node(val);
    if (head == null) {
        return newNode;
    }
    Node curr = head;
    while (curr.next != null) {
        curr = curr.next;
    }
    curr.next = newNode;
    return head;
}
public static Node insertAtN(Node head,int val,int pos){
Node newNode=new Node(val);
int c=1;
    if(pos<1){
        return head;
    }
    if(pos==1){
        Node node=new Node(val);
        node.next=head;
        return node;
    }
    Node curr=head;
    while(curr!=null && c<pos-1){
        curr=curr.next;
        c++;
    }
    newNode.next=curr.next;
    curr.next=newNode;

return head;

}
public static Node deleteAtStart(Node head){
   if(head==null){
    return head;
   }
   Node temp=head;
   head=head.next;
   temp=null;
   return head;
}
public static Node deleteAtEnd(Node head){
    if(head==null || head.next==null){
        return null;
    }
    Node temp=head;
    while(temp.next.next!=null){
        temp=temp.next;
    }
    temp.next=null;
return head;
}
// public static Node deleteAtN(Node head,int pos){
//     if(head==null){
//         return null;
//     }
//     int c=1;
//     Node temp=head;
//     Node prev=null;
//     while(temp!=null && c<pos){
        

//     }
//     return head;
// }
public static void reverse(Node head){
    Node curr=head,prev=null,next;
    while(curr!=null){
        next=curr.next;
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=null;
        Node tail=null;
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            Node node=new Node(val);
            if(head==null){
                head=node;
tail=node;
            }
            else{
                tail.next=node;
                tail=node;
            }
        } 
        head=deleteAtEnd(head);
        traversal(head); 
    }
}

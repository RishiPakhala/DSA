import java.util.Scanner;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next=null;
    }
}
public class SingleLinkedList {
    Node head;
    public void add(int data) {
    Node newNode=new Node(data);
    if(head==null) {
        head=newNode;
    } else {
        Node temp=head;
        while(temp.next != null) {
            temp=temp.next;
        }
        temp.next=newNode;
    }
    }
    public void display() {
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
    }
    public static void main(String args[]) {
        SingleLinkedList list=new SingleLinkedList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 nodes: ");
        for(int i=0;i<5;i++) {
            int a=sc.nextInt();
            list.add(a);
        }
        System.out.println("Nodes are: ");
        list.display();
        sc.close();
    }
}
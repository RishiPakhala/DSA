class Node {
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next=null;
    }
}
public class InsertionSLL {
    Node head;
    public void insertion(int data,int position) {
        Node newNode=new Node(data);
        if(position == 1) {
            newNode.next=head;
            head=newNode;
            return;
        }
        Node temp=head;
        int count=1;
        while(temp!=null && count<position-1) {
            temp=temp.next;
            count++;
        }
        if(temp==null) {
            System.out.println("Position out of bounds");
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void display() {
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
    }
    public static void main(String args[]) {
        InsertionSLL list=new InsertionSLL();
        list.insertion(1,1);
        list.insertion(234,2);
        list.insertion(3332,2);
        list.display();
    }
}

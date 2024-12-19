class Node {
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next=null;
    }
}
public class StackLL {
    Node head;
    public boolean isEmpty() {
        return (head==null);
    }
    public void push(int data) {
        Node newNode=new Node(data);
        if(head==null) {
            head=newNode;
            return;
        }
        else {
            newNode.next=head;
            head=newNode;
        }
    }
    public void pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        head=head.next;
    }
    public void peek() {
        System.out.print(head.data);
    }
    public void display() {
        Node temp=head;
        if(isEmpty()) {
            System.out.println("Stack is Empty");
        }
        else {
            while(temp!=null) {
            System.out.print(temp.data+"--");
            temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        StackLL list=new StackLL();
        list.push(12);
        list.push(7);
        list.push(123);
        list.push(1232);
        list.push(9803);
        System.out.println("stack after pushing: ");
        list.display();
        list.pop();
        list.pop();
        System.out.print("stack after popping 2 elements: ");
        list.display();

    }
}

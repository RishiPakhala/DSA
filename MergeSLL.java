class Node {
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next=null;
    }
}
class MergeSLL {
    Node head;
    Node current;
    public void insert(int data) {
        Node newNode=new Node(data);
        if(head==null) {
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null) {
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void display() {
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void Merge(Node h1,Node h2) {
        if(h1==null) {
            head=h2;
        }
        if(h2==null) {
            head=h1;
        }
        if(h1.data<=h2.data) {
            head=h1;
            h1=h1.next;
            current=head;
        }
        else {
            head=h2;
            h2=h2.next;
            current=head;
        }
        while(h1!=null && h2!=null) {
            if(h1.data<=h2.data) {
                current.next=h1;
                h1=h1.next;
                current=current.next;
            }
            else {
                current.next=h2;
                h2=h2.next;
                current=current.next;
            }
        }
        if(h1==null) {
            current.next=h2;
        }
        else {
            current.next=h1;
        }
    }
    public static void main(String[] args) {
        MergeSLL list1=new MergeSLL();
        MergeSLL list2=new MergeSLL();
        list1.insert(1);
        list1.insert(3);
        list1.insert(5);
        list2.insert(2);
        list2.insert(4);
        list1.display();
        list2.display();
        MergeSLL list=new MergeSLL();
        list.Merge(list1.head,list2.head);
        list.display();
    }
}
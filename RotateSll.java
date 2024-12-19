public class RotateSll {
        Node head;
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
        public void rotate(int k) {
            Node current=head;
            int length=1;
            while(current.next!=null) {
                current=current.next;
                length++;
            }
            k=k%length;
            if(k==0) {
                return;
            }
            current.next=head;
            int sNT=length-k;
            Node newTail=head;
            for(int i=0;i<sNT;i++) {
                newTail=newTail.next;
            }
             head=newTail.next;
            newTail.next=null;
            return;
        }
        public void display() {
            Node temp=head;
            while(temp.next!=null) {
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
            System.out.println();
        }
        public static void main(String args[]) {
            RotateSll list=new RotateSll();
            list.insert(1);
            list.insert(2);
            list.insert(3);
            list.insert(4);
            list.display();
            int k=3;
            list.rotate(k);
            list.display();
        }
    }
    class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
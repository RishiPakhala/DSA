public class ReverseStack {
    private int[] Stack;
    private int top;
    private int capacity;
    private int size=5;

    public ReverseStack() {
        Stack =new int[size];
        capacity=size;
        top=-1;
    }
    public void push(int item) {
        if(top==capacity-1) {
            System.out.println("Stack Overflow");
            return;
        }
        top=top+1;
        Stack[top]=item;
    }
    public int pop() {
        if(top==-1) {
            System.out.println("Stack underflow");
            return -1;
        }
        return Stack[top--];
    }
    public void reverseStack() {
        if(top==-1) {
            return;
        }
        int temp=pop();
        reverseStack();
        insertAtbottom(Stack,temp);
    }
    void insertAtbottom(int[] Stack,int item) {
        if(top==-1) {
            push(item);
            return;
        }
        else {
            int temp=pop();
            insertAtbottom(Stack, item);
            push(temp);
        }
    }
    public void display() {
        if(top==-1) {
            System.out.println("Stack is empty");
            return;
        }
        for(int i=0;i<=top;i++) {
        System.out.print(Stack[i]+" ");
        }
    }
    public static void main(String args[]) {
        ReverseStack a=new ReverseStack();
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        a.push(5);
        a.display();
        a.reverseStack();
        System.out.print("-------- ");
        a.display();
    }
}

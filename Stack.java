public class Stack {
    int top=-1;
    int max=5;
    int[] a=new int[max];
    public boolean isEmpty() {
        return (top==-1);
    }
    public boolean isFull() {
        return (top==max-1);
    }
    public void push(int data) {
        if(isFull()) {
            System.out.println("Stack is full");
            return;
        }
        top=top+1;
        a[top]=data;
    }
    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        int result=a[top];
        top=top-1;
        return result;
    }
    public void peek() {
        System.out.print(a[top]);
    }
    public void display() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for(int i=top;i>=0;i--) {
            System.out.print(a[i]+"--");
        }
    }
    public static void main(String args[]) {
        Stack s=new Stack();
        s.push(1);
        s.push(21);
        s.push(7);
        s.push(23442);
        s.push(7232);
        int a=s.pop();
        System.out.println("Element popped: "+a);
        System.out.println("Elements in stack are: ");
        s.display();
        System.out.print("\n Top element of the stack is: ");
        s.peek();
    }
}

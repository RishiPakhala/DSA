import java.util.Stack;
import java.util.Scanner;
class Node2 {
    int data;
    Node2 left;
    Node2 right;
    Node2(int data) {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class SpiralOrder {
    Scanner sc=new Scanner(System.in);
    public Node2 insert(Node2 root) {
        System.out.print("Enter element: ");
        int ele=sc.nextInt();
        if(!(ele==-1)) {
        Node2 newNode=new Node2(ele);
        root=newNode;
        System.out.println("Enter left of "+ele);
        root.left=insert(root.left);
        System.out.println("Enter right of "+ele);
        root.right=insert(root.right);
    }
        else {
            return null;
        }
        return root;
    }
    public void SpiralNode(Node2 root) {
        if(root==null) {
            return;
        }
        Stack<Node2> s1=new Stack<>();
        Stack<Node2> s2=new Stack<>();
        s1.push(root);
        while(!s1.isEmpty() || !s2.isEmpty()) {
            
            while(!s1.isEmpty()) {
                Node2 current=s1.pop();
                System.out.print(current.data+" ");
                if(current.left!=null) {
                    s2.push(current.left);
                }
                if(current.right!=null) {
                    s2.push(current.right);
                }
            }
            while(!s2.isEmpty()) {
                Node2 current = s2.pop();
                System.out.print(current.data+" ");
                if(current.right!=null) {
                    s1.push(current.right);
                }
                if(current.left!=null) {
                    s1.push(current.left);
                }
            }
        }
    } 
    public static void main(String[] args) {
        SpiralOrder node=new SpiralOrder();
        Node2 root=null;
        root=node.insert(root);
        System.out.print("Spiral order: ");
        node.SpiralNode(root);
    }
}
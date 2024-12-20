 import java.util.*;
 class Node1 {
    int data;
    Node1 left;
    Node1 right;
    Node1(int data) {
        this.data=data;
        this.left=null;
        this.right=null;
    }
 }
class FlattenBT {
    Scanner sc=new Scanner(System.in);
    public Node1 Construct(Node1 root) {
        System.out.println("Enter element: ");
        int ele=sc.nextInt();
        if(!(ele==-1)) {
            Node1 newNode1=new Node1(ele);
            root=newNode1;
            System.out.println("Enter left element of "+ele);
            root.left=Construct(root.left);
            System.out.println("Enter right element of "+ele);
            root.right=Construct(root.right);
        } else {
            return null;
        }
        return root;        
    }
    public void Traverse(Node1 root) {
        if(root==null) {
            return;
        }
        System.out.print(root.data+" ");
        Traverse(root.left);
        Traverse(root.right);
    }
    public void TraverseIn(Node1 root) {
        if(root==null) {
            return;
        }
        Traverse(root.left);
        System.out.print(root.data+" ");
        Traverse(root.right);
    }
    public void flattenBT(Node1 root) {
        if(root==null) {
            return;
        }
        flattenBT(root.left);
        flattenBT(root.right);
        Node1 tempR=root.right;
        root.right=root.left;
        root.left=null;
        Node1 current=root;
        while(current.right!=null) {
            current=current.right;
        }
        current.right=tempR;
    }
    public void PrintFlattenedBT(Node1 root) {
        Node1 current=root;
        while(current!=null) {
            System.out.print(current.data+"-->");
            current=current.right;
        }
        System.out.print("null");
    }
    public void TraversePo(Node1 root) {
        if(root==null) {
            return;
        }
        Traverse(root.left);
        Traverse(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        FlattenBT bt=new FlattenBT();
        Node1 root=null;
        root=bt.Construct(root);
        System.out.print("Pre order Elements: ");
        bt.Traverse(root);
        System.out.print("\nIn order Elements: ");
        bt.TraverseIn(root);
        System.out.print("\nPost order Elements: ");
        bt.TraversePo(root);
        bt.flattenBT(root);
        System.out.print("\nFlattened Binary Tree into Linked List: ");
        bt.PrintFlattenedBT(root);
    }
}
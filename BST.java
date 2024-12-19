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
public class BST {
    public  Node2 insert(Node2 root,int data) {
        if(root==null) {
            Node2 newnode=new Node2(data);
            root=newnode;
            return root;
        }
        else if(root.data>data) {
            root.left=insert(root.left,data);
        } else if(root.data<data) {
            root.right=insert(root.right,data);
        }
        return root;
    }
    public void Inorder(Node2 root) {
        if(root==null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    public void Postorder(Node2 root) {
        if(root==null) {
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data+" ");
    }
    public boolean Search(Node2 root,int key) {
        if(root==null) {
            return false;
        }
        if(root.data==key) {
            return true;
        }
        if(root.data>key) {
            return Search(root.left,key);
        }
        else if(root.data<key) {
            return Search(root.right,key);
        }
        return false;
    }
    public static void main(String args[]) {
        BST b=new BST();
        Node2 root=null;
        root=b.insert(root,1);
        b.insert(root,43);
        b.insert(root,21);
        b.insert(root,98);
        b.insert(root,3);
        b.insert(root,7);
        b.insert(root,2);
        b.insert(root,5);
        System.out.print("inorder traversal: ");
        b.Inorder(root);
        System.out.print("\nPostorder traversal: ");
        b.Postorder(root);
        boolean a=b.Search(root,21);
        if(a){
            System.out.println("\nFOund in the BST");
        }
        else {
            System.out.println("\n Not Found");
        }
    }
}

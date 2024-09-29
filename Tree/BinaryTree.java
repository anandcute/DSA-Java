public class BinaryTree {
    Node root;
    class Node{
        int data;
        Node left;
        Node right;
        Node(int value){
            data = value;
            left = null;
            right = null;
        }

    }
    BinaryTree(int d){
        root = new Node(d);
    }

    public void insertLeft(Node n , int value){
        Node newNode = new Node(value);
        n.left = newNode;
    }
    public void insertRight(Node n , int value){
        Node newNode = new Node(value);
        n.right = newNode;
    }
    public static void preOrder(Node root){
        if(root != null){
            System.out.print(root.data + " ");
            preOrder(root.left );
            preOrder(root.right );
        }
    }
    public static void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public static void postOrder(Node root){
        if(root != null){
            postOrder(root.left );
            postOrder(root.right );
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(10);

        tree.insertLeft(tree.root, 5);
        tree.insertRight(tree.root,15);
        tree.insertLeft(tree.root.left,3);
        tree.insertRight(tree.root.left,8);
        tree.insertLeft(tree.root.right,12);

        preOrder(tree.root);
        System.out.println();
        inOrder(tree.root);
        System.out.println();
        postOrder(tree.root);
    }
}

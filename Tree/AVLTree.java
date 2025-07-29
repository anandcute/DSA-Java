

public class AVLTree {
    Node root;
    class Node{
        int data;
        Node left , right;
        int height;
        Node(int value){
            data = value;
            left = right = null;
            height = 0;
        }
    }
    public AVLTree(int value){
        root = new Node(value);
    }
    public AVLTree(){
        root = null;
    }
    public void insert(int value){
        root = insert(root, value);
    }
    public Node insert(Node node , int value){
        if(node == null){
            return new Node(value);
        }
        if(value < node.data)
            node.left = insert(node.left, value);
        else if(value > node.data)
            node.right = insert(node.right, value);
        else
            return node;
        node.height = 1 + max(getHeight(node.left) , getHeight(node.right));
        int balFactor = getBalanceFactor(node);

        // LL case 
        if(balFactor > 1 && value < node.left.data){
            return rightRotate(node);
        }
        // LR case
        if(balFactor > 1 && value > node.left.data){
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }    
        // RR case
        if(balFactor < -1 && value > node.right.data){
            return leftRotate(node);
        }

        // RL case
        if(balFactor < -1 && value < node.right.data){
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;    
    }
    private Node rightRotate(Node z){
        Node y = z.left;
        Node t3 = y.right;

        y.right = z;
        z.left = t3;

        z.height = 1 + max(getHeight(z.left), getHeight(z.right));
        y.height = 1 + max(getHeight(y.left), getHeight(y.right));
        
        return y ;
    }
    private Node leftRotate(Node z){
        Node y = z.right;
        Node t3 = y.left;

        y.left = z;
        z.right = t3;

        z.height = 1 + max(getHeight(z.left), getHeight(z.right));
        y.height = 1 + max(getHeight(y.left), getHeight(y.right));
        
        return y ;
    }
    public int getHeight(Node node){
        if(node == null)
            return -1;
        return node.height;   
    }
    public int max(int a , int b){
        return a > b ? a : b ;
    }
    private int getBalanceFactor(Node node){
        if(node == null)
            return 0 ;
        return getHeight(node.left) - getHeight(node.right);    
    }

    public void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.println(root.data + " update height is " + root.height);
            inOrder(root.right);
        }
    }

}

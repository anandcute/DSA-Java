public class BinarySearchTree {
    Node root;
    class Node{
        int key;
        Node left, right;
        public Node (int val){
            key = val;
            left = right = null;
        }
    }
    public BinarySearchTree(int val){
        root = new Node(val);
    
    }
    public BinarySearchTree(){
        root = null;
    }

    public void insert(int val){
        insert(root,val);
        // System.out.println(root.key);
    }
    public Node insert(Node root , int value){
        if(root == null){
           return  new Node(value);
        }
        if(value < root.key){
            root.left = insert(root.left, value);
        }
        else
            root.right = insert(root.right, value);
        return root;    
    }
    public void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.key + " ");
            inOrder(root.right);
        }
    }
    public Node search(Node root , int value){
        if (root == null || root.key == value) {
            return root;
        }
        if(value < root.key)
           return search(root.left, value);
        return search(root.right, value); 
    }

    public Node delete(Node root , int value){
        if(root == null)
            return root;
        if(root.key < value)
           root.right = delete(root.right, value);
        else if(root.key > value)
            root.left = delete(root.left, value);
        else{
            if(root.right == null)
                return root.left;
            else if(root.left == null)
                return root.right;
            root.key = min(root.right,value); // two children
            root.right = delete(root.right, value);
        }  
        return root;  
    }
       
    public int min(Node root , int value){
        int minVal = root.key;
        while(root.left != null){
            minVal = root.left.key;
            root = root.left;
        }
        return minVal;
    }
}

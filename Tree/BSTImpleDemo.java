public class BSTImpleDemo {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree(50);
        bst.insert(bst.root,70);
        bst.insert(10);
        bst.insert(25);
        bst.insert(60);
        bst.insert(90);
        bst.insert(20);

        bst.inOrder(bst.root);
        System.out.println();

        if(bst.search(bst.root , 10) == null){
            System.out.println("Element  not found");
        }
        else{
            System.out.println("Element found");
        }

        bst.delete(bst.root , 2);
        bst.inOrder(bst.root);
    }
}
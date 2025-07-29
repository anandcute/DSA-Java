public class AVLImplementation {
    public static void main(String[] args){
        AVLTree avl = new AVLTree(50);
        avl.insert(20);
        avl.insert(60);
        avl.insert(10);
        avl.insert(30);
        avl.insert(40);

        avl.inOrder(avl.root);

    }
}

import java.util.Iterator;
public class ImplementationOfDL_List{
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
        list.insertAtBeginning(3);
        list.insertAtBeginning(5);
        list.insertAtBeginning(7);
        list.insertAtBeginning(9);
        // list.display();
        // System.out.println("");
        // list.displayReverse();

        // System.out.println("");
        // list.insertAtPosition(1,10);
        // // list.display();
        // System.out.println("");
        // list.displayReverse();

        // list.deleteAtBeginning();
        // list.display();
        // System.out.println("");
        // list.displayReverse();

        // list.deleteAtPosition(0);
        // list.display();
        // System.out.println("");
        // list.displayReverse();

        System.out.println("Forward Iteration:");
        for (Object i : list) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Reverse Iteration:");
        Iterator<Integer> revIter = list.reverseIterator();
        while (revIter.hasNext()) {
            System.out.print(revIter.next() + " ");
        } 

        
    }
}
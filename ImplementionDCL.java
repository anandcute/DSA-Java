import java.util.Iterator;

public class ImplementionDCL {
    
    public static void main(String[] args) {
        DoublyCirucularLL<Integer> list =new DoublyCirucularLL<Integer>();

        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);
        list.insertAtEnd(40);

        // System.out.println(list.length());
        // list.insertAtPosition(4, 45);
        // list.display();
        // System.out.println(" ");
        // // list.reverse();
        // System.out.println(" ");

        //Deletion 
        // list.deleteAtBeginning();
        // list.deleteAtEnd();
        // list.deleteAtPosition(5);
        // list.display();
        // System.out.println();
        // list.reverse();

        // for (Object ob : list){
        //     System.out.print(ob + " ");
        // }

        // Another type of object output

        Iterator<Integer> i = list.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        System.out.println();
        Iterator<Integer> reverse = list.reverseIterator();
        while (reverse.hasNext()) {
            System.out.print(reverse.next() + " ");
        }

    }
}

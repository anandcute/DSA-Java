
public class ImplementationOfLinkedList {
    public static void main(String[] args) {
        Demo_LinkedList<Integer> list = new Demo_LinkedList<Integer>();
        //String

        // list.insertAtBeginning("Anand");
        // list.insertAtBeginning("Deepak");
        // list.insertAtBeginning("Dhanam");
        // list.display();
        // System.out.println(" ");
        // list.insertAtPosition(3,"Dhasaradhan");
       
        // list.deleteAtPositon(2);
        // list.display();

        // list.getvalue(1);
        //list.updateAtPosition(1, "Hema");

        // list.insertAtEnd("SoftwareDevloper");
        // list.display();

        // System.out.println(list.search("Anand"));

        // System.out.println(list.contains("Deepak"));
        // for (Object a : list) {
        //     System.out.print(a + " ");
        // }

        // // System.out.println(" ");
        // list.reverse();
        // list.display();

        //Integer

        list.insertAtBeginning(9);
        list.insertAtBeginning(7);
        list.insertAtBeginning(3);
        list.display();
        System.out.println(" ");
        list.insertAtPosition(3,5);
        list.display();

        System.out.println(" ");
        list.reverse();
        list.display();
       
        System.out.println(" ");
        list.deleteAtPositon(2);
        list.display();

        System.out.println(" ");
        list.getvalue(1);
        list.updateAtPosition(1, 8);
        list.display();

        System.out.println(" ");
        list.insertAtEnd(10);
        list.display();
        System.out.println(" ");
        System.out.println(list.search(3));

        System.out.println(list.contains(9));
        for (Object a : list) {
            System.out.print(a + " ");
        }

       


    }
}

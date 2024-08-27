public class ImplementationAtCLL {
    public static void main(String[] args) {
        CirucularLinkedList<String> list = new CirucularLinkedList<String>();

        list.insertAtBeginning("Deepak");
        list.insertAtBeginning("Anand");
        list.insertAtBeginning("Dhanam");
        list.insertAtBeginning("Dhasa");
        list.insertAtEnd("Kumar");
        list.display();

        System.out.println("");

        // list.insertAtPosition(4, "hema"); 
        // list.display();

    //    System.out.println("\nlength of list : " + list.length());

        list.deleteAtPosition(1);
        list.display();
        // list.deleteAtBeginning();
        // System.out.println(list.deleteAtBeginning());
        // list.display();

        // list.deleteAtEnd();
        // list.display();

        // list.updateAtPosition(1, "Dee");
        // list.display();

        // for (Object ob : list){
        //     System.out.print(ob + " ");
        // }
        // list.reverse();
        // list.display();

        

        

    }
}

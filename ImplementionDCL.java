public class ImplementionDCL {
    
    public static void main(String[] args) {
        DoublyCirucularLL<Integer> list =new DoublyCirucularLL<>();

        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);
        // list.insertAtEnd(40);

        // System.out.println(list.length());
        list.insertAtPosition(4, 45);
        list.display();
        System.out.println(" ");
        list.reverse();

    }
}

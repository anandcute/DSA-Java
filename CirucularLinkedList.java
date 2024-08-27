import java.util.Iterator;
import java.util.NoSuchElementException;

// import org.w3c.dom.Node;

public class CirucularLinkedList<T> implements Iterable{
    Node last;

    class Node {
        T data;
        Node next;

        Node(T value) {
            data = value;
            next = null;
        }
    }

    CirucularLinkedList() {
        last = null;
    }

    public void insertAtBeginning(T value) {
        Node newNode = new Node(value);
        if (last == null) {
            newNode.next = newNode;
            last = newNode;
        } else {
            newNode.next = last.next;
            last.next = newNode;
        }
    }

    public void insertAtEnd(T value) {
        Node newNode = new Node(value);
        if (last == null) {
            newNode.next = newNode;
            last = newNode;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }
    public void insertAtPosition(int position , T value){
        Node newNode = new Node(value);
      
        if (position == 0 ) {
            insertAtBeginning(value);
            return;
        }
        if(position == length()){
            insertAtEnd(value);
            return;
        }
        Node temp = last.next;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int length(){
        int count = 1;
        Node temp = last.next;
        while (temp != last) {
            count++;    
            temp = temp.next;
        }
        return count;
    }

    public void display() {
        if(last == null){
            return;
        }
        Node temp = last.next;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != last.next);
    }

    public void deleteAtBeginning() {
        if (last == null) {
            throw new ArrayIndexOutOfBoundsException("Deletion atempt is empty list");
        }
        // T val = last.next.data;

        if (last.next == last) {
            last = null;
            System.out.println("List empty");
        }
        else
            last.next = last.next.next;
        // return val;    
    }
    public void deleteAtEnd() {
        if (last == null) {
            throw new ArrayIndexOutOfBoundsException("Deletion atempt is empty list");
        }
       

        if (last.next == last) {
            last = null;
            // System.out.println("List empty");
        }
        else{
            Node temp = last.next;
            while (temp.next != last) {
                temp = temp.next;
            }
            temp.next = last.next;
            last = temp;
        }
    }
    public void deleteAtPosition(int position ){
       
        if (position == 0 ) {
            deleteAtBeginning();
            return;
        }
        if(position == length()){
            deleteAtEnd();
            return;
        }
        Node prev = last;
        Node temp = last.next;
        for (int i = 1; i <= position ; i++) {
            temp = temp.next;
            prev = prev.next;
        }
        prev.next = temp.next;

    }

    public void updateAtPosition(int position , T value){
        if (position == 0){
            last.next.data = value;
            return;
        }
        Node temp = last.next;
        for(int i = 1 ; i <= position ; i++){
            temp = temp.next;
            if(temp == null){
                throw new ArrayIndexOutOfBoundsException("Position out of bounds");
            }
        }
        temp.data = value;
    }

    public void reverse(){
        Node prev = last;
        Node current = last.next;
        Node next ;
        Node first = last.next; // store the original value for first  because loop ku condition koduka apo the crt ya loop run agum.

        do {
            next = current.next;    // Save the next node
            current.next = prev;    // Reverse the link
            prev = current;         // Move prev to current
            current = next;         // Move to the next node
        } while (current != first); // Continue until we've reversed all nodes
        last = first;   
    }

   public Iterator<T> iterator() {
    return new Iterator<T>() {
        private Node temp = last != null ? last.next : null; // Start from the node after 'last'
        private boolean firstIteration = true; // To check if it's the first element

        @Override
        public boolean hasNext() {
            return temp != null && (firstIteration || temp != last.next);
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            firstIteration = false; // After first iteration, set this to false
            T val = temp.data;
            temp = temp.next;
            return val;
        }
    };
}


}

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator;

import org.w3c.dom.Node;

public class DoublyLinkedList<T> implements Iterable {
    Node head;
    Node tail;

    class Node {
        T data;
        Node prev;
        Node next;

        Node(T value) {
            data = value;
            next = null;
            prev = null;
        }
    }

    DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public void insertAtBeginning(T value) {
        Node newNode = new Node(value);

        if (head == null) {
            tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
        }
        head = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next; // jump to next node
        }
    }

    public void displayReverse() {
        if (head == null)
            System.out.println("List is empty");
        Node temp = tail;// Start from head
        while (temp != null) { // null implies end of list
            System.out.print(temp.data + " ");
            temp = temp.prev; // jump to next node
        }
    }

    public void insertAtPosition(int position, T value) {
        Node newNode = new Node(value);
        if (position == 0) {
            insertAtBeginning(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < position; i++) {
            temp = temp.next; // jump to next node
            if (temp == null) {
                throw new NullPointerException("invalid input  | list is empty");
            }
        }
        // reasign the pointer
        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp == tail)
            tail = newNode;
        else
            temp.next.prev = newNode; // rev
        temp.next = newNode;
    }

    public void deleteAtPosition(int position) {
        if (position == 0) {
            deleteAtBeginning();
            return;
        }
        if (head == null)
            throw new NullPointerException("List is empty");
        Node temp = head;
        Node prev = null;
        // till node into to be deleted
        for (int i = 0; i < position; i++) {
            prev = temp; // keep to track previous node
            temp = temp.next; // jump to next node
            if (temp == null)
                throw new IndexOutOfBoundsException(" Invalid input");
        }
        prev.next = temp.next; // reassign pointer
        if (temp.next == null)
            tail = prev;
        else
            temp.next.prev = prev;

    }

    public void deleteAtBeginning() {
        if (head == null)
            throw new NullPointerException("List is empty");

        head = head.next;
        if (head == null) { // head is empty
            tail = null;
            System.out.println("Delete the node");
        } else
            head.prev = null;
    }

    public Iterator<T> iterator(){
        return new Iterator<T>() {
            Node temp = head;
            public boolean hasNext(){
                return head != null;
            }
            public T next(){
                T data = head.data ;
                head = head.next ;
                return data ;
            }
        };
    }

    public Iterator<T> reverseIterator() { // reverse
        return new Iterator<T>() {
            private Node temp = tail;

            @Override
            public boolean hasNext() {
                return temp != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T data = temp.data;
                temp = temp.prev; // Assuming 'prev' points to the previous node
                return data;
            }
        };
    }

}
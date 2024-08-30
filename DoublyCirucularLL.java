import java.util.Iterator;
import java.util.NoSuchElementException;

import org.w3c.dom.Node;

public class DoublyCirucularLL<T> implements Iterable {
    Node last;

    class Node {
        Node previous;
        T data;
        Node next;

        Node(T value) {
            previous = null;
            data = value;
            next = null;
        }
    }

    DoublyCirucularLL() {
        last = null;
    }

    public void insertAtBeginning(T value) {
        Node newNode = new Node(value);

        if (last == null) {
            newNode.previous = newNode;
            newNode.next = newNode;
            last = newNode;
        } else {
            newNode.previous = last;
            newNode.next = last.next;
            last.next.previous = newNode;
            last.next = newNode;
        }

    }

    public void insertAtEnd(T value) {
        Node newNode = new Node(value);
        if (last == null) {
            newNode.previous = newNode;
            newNode.next = newNode;
        } else {
            newNode.previous = last;
            newNode.next = last.next;
            last.next.previous = newNode;
            last.next = newNode;
        }
        last = newNode;
    }

    public void insertAtPosition(int position, T value) {
        Node newNode = new Node(value);
        if (position == 0) {
            insertAtBeginning(value);
            return;
        }
        if (position == length()) {
            insertAtEnd(value);
            return;
        }
        Node temp = last.next;
        for (int i = 1; i < position; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        newNode.previous = temp;
        temp.next.previous = newNode;
        temp.next = newNode;
    }

    public int length() {
        int count = 1;
        Node temp = last.next;
        while (temp != last) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public void deleteAtBeginning() {
        if (last == null) {
            throw new NullPointerException("List is empty");
        }
        if (last.next == last) {
            last = null;
        } else {
            Node temp = last.next;
            temp.next.previous = last;
            last.next = temp.next;
        }
    }

    public void deleteAtEnd() {
        if (last == null) {
            throw new NullPointerException("List is empty");
        }
        if (last.next == last) {
            last = null;
        } else {
            Node temp = last.next;
            Node first = last.next;
            Node previous = last;
            do {
                temp = temp.next;
                previous = previous.next;
            } while (temp != last);
            temp.next.previous = previous;
            previous.next = temp.next;
            last = previous;
        }
    }

    public void deleteAtPosition(int position) {
        if (last == null) {
            throw new NullPointerException("List is empty");
        }
        if (position == 0) {
            deleteAtBeginning();
            return;
        } else if (position == length()) {
            deleteAtEnd();
            return;
        }
        Node temp = last.next;
        Node pre = last;
        for (int i = 0; i < position; i++) {
            temp = temp.next;
            pre = pre.next;
        }
        temp.next.previous = pre;
        pre.next = temp.next;
    }

    public void updateAtPosition(int position, T value) {
        if (position == 0) {
            last.data = value;
            return;
        }
        Node temp = last.next;
        for (int i = 0; i < position; i++) {
            temp = temp.next;
        }
        temp.data = value;
    }

    public void display() {
        if (last == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = last.next;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != last.next);
    }

    public void reverse() {
        if (last == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = last;
        do {
            System.out.print(temp.data + " ");
            temp = temp.previous;
        } while (temp != last);
    }

    public Iterator<T> iterator(){
        return new Iterator<T>() {
            Node temp =last != null ? last.next : null ;
            boolean firstIteration = true;
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
    public Iterator<T> reverseIterator() { // reverse
        return new Iterator<T>() {
            private Node temp = last;
            boolean firstIteration = true;
            @Override
            public boolean hasNext() {
                return temp != null && (firstIteration || temp != last);
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                firstIteration = false; // After first iteration, set this to false
                T data = temp.data;
                temp = temp.previous; // Assuming 'prev' points to the previous node
                return data;
            }
        };
    }

}

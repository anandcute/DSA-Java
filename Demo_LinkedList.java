// using Generics becasue of use many data type  

import java.util.Iterator;

public class Demo_LinkedList<T> implements Iterable {
    private Node head;
    //private Node tail;
    class Node{
        T data;
        Node next;
        Node(T value){
            data = value;
            next = null;
        }
    }
    public void insertAtBeginning(T value){
        Node newNode = new Node(value);
        //When the list is empty
        if(head == null){
            head = newNode;
        }
        //when the list is not empty
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    //2. Traverse
    public void display(){
        Node temp = head; // start from head
        while(temp != null){ // null implies to end
            System.out.print(temp.data + " ");
            temp = temp.next; //jump to next node
        }
    }
    //Insert at position
    public void insertAtPosition(int position , T value){
        Node newNode = new Node(value);
        if(position == 0){
            insertAtBeginning(value);
            return; // index 0 kodutha intha method work agum and return vanthu begining method ya work complte panidum so next line poga vena .
        }
        Node temp = head;
        for(int i = 1; i < position ; i++){
            temp = temp.next; // jump to previous node
            if(temp == null){
                throw new ArrayIndexOutOfBoundsException( " Position out of bound Invalid pos " + position );
            } // if position is greater than size of list
        }
        newNode.next = temp.next; // first vanthu previous la iruka(ptr) la address  ya new node ptr(next) ku anupanum 
        temp.next = newNode; // next vanthu newnode address ya pre ptr(next) ku anupi store pananum....
    }
    public void deleteAtPositon(int position){
        if(position == 0){
            head = head.next; // head node delete pananum
            return;
        }
        else if(head == null){
            throw new ArrayIndexOutOfBoundsException("Deletion attempt is empty list");
        }
        Node temp = head ;
        Node prev = null;
        for(int i = 1 ; i <= position ; i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;

    }
    public void deleteAtBeginning(){
        if(head == null){
            throw new ArrayIndexOutOfBoundsException("Deletion attempt is empty list");
        }

        head = head.next;
    }
    public void getvalue(int position){
        Node temp =  head;
        for(int i = 1 ; i <= position; i++ ){
            temp = temp.next;
        } 
        System.out.println(temp.data + " ");
    }
    //Update At Position
    public void updateAtPosition(int position , T value){
        Node temp = head;
        for(int i = 1 ; i <= position ; i++ ){
            temp = temp.next;
        }
        temp.data = value;
    }
    public void insertAtEnd(T value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int search(T value){
        int index = 0;
        Node temp = head; // start from head
        while(temp != null){ // null implies to end
           if(temp.data == value){
            return index ;
           }
            temp = temp.next; //jump to next node
            index++;
        }
        return -1 ;
    }
    public boolean contains(T value){
        Node temp = head; // start from head
        while(temp != null){ // null implies to end
            if(temp.data == value){
                return true;
            }
            temp = temp.next; //jump to next node
        }
        return false;    
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

    //Reverse the list 
    public void reverse(){
        Node prev = null;
        Node current = head;
        Node next = head.next;
        

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }


}

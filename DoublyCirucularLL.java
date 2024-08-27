import org.w3c.dom.Node;

public class DoublyCirucularLL<T> {
    Node last;

    class Node{
        Node previous;
        T data;
        Node next;
        
        Node(T value){
            previous = null;
            data = value;
            next = null;
        }
    }
    DoublyCirucularLL(){
        last = null;
    }
    public void insertAtBeginning(T value){
        Node newNode = new Node(value);
      
        if(last == null){
            newNode.previous =newNode; 
            newNode.next = newNode;
            last = newNode;
        }
        else{
            newNode.previous = last;
            newNode.next = last.next;
            last.next.previous = newNode;
            last.next = newNode;
        }

    }
    public void insertAtEnd(T value){
        Node newNode = new Node(value);
        if(last == null){
            newNode.previous = newNode;
            newNode.next = newNode;
        }
        else{
            newNode.previous = last;
            newNode.next = last.next;
            last.next.previous = newNode;
            last.next = newNode;
        }
        last = newNode;
    }
    public void insertAtPosition(int position , T value){
        Node newNode = new Node(value);
        if(position == 0 ){
            insertAtBeginning(value);
            return;
        }
        if (position == length()){
            insertAtEnd(value);
            return;
        }
        Node temp = last.next;
        for(int i = 1 ; i < position ; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        newNode.previous = temp;
        temp.next.previous = newNode;
        temp.next = newNode;
    }

    public int length(){
        int count = 1;
        Node temp = last.next;
        while (temp != last) {
            temp = temp.next;
            count++;    
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
    public void reverse(){
        Node temp = last;
        do {
            System.out.print(temp.data + " ");
            temp = temp.previous;
        }while(temp != last);
    }




        

}

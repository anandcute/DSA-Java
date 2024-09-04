public class Linkedlist_Queue <T> {
    Node head;
    Node tail;

    class Node{
        T data;
        Node next;
        Node(T val){
            data = val;
            next = null;
        }
    }
    Linkedlist_Queue(){
        head = null;
    }
    public void enqueue(T value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }
        else{
            tail.next = newNode;
        }
        tail = newNode;

    }
    public T dequeue(){
        if(head == null){
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        T temp = head.data; 
        head = head.next;
        if(head == null )
            tail = null;
        return temp;
    }
    public boolean isEmpty(){
        return head == null;
    }

    public T elementAtFront(){
        if(head == null){
             throw new IndexOutOfBoundsException("Queue is empty");
        }
        T current = head.data;
        return current;
    }
    public static void main(String[] args) {
        Linkedlist_Queue<Integer> queue = new Linkedlist_Queue<Integer>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(5);
        
        System.out.println("Dequeue value is : " + queue.dequeue());
        System.out.println("Dequeue value is : " + queue.dequeue());
        System.out.println("Dequeue value is : " + queue.dequeue());
        
        queue.enqueue(2);
        queue.enqueue(5);

        System.out.println("Dequeue value is : " + queue.dequeue());


        System.out.println("current value : " + queue.elementAtFront());

        System.out.println("Queue is empty or not : " + queue.isEmpty());
    }
            

}

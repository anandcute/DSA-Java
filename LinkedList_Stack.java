public class LinkedList_Stack <T> {
    Node top;
    class Node{
        T data;
        Node next;
        Node(T val){
            data = val;
            next = null;
        }
    } 
    LinkedList_Stack(){
        top = null;
    }
    public void push(T value){ // Time complicity - o(1)
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }
    public T pop(){ // Time complicity - o(1)
        if(top == null){
            System.out.println("Stack is empty");
        }
        T temp = top.data;
        top = top.next;
        return temp;
    }
    public T peek(){
        return top.data;
    }
    boolean isEmpty(){
        return top == null;
    }
        
            
    public static void main(String[] args) {
        LinkedList_Stack<Integer> stack = new LinkedList_Stack<Integer>();
        stack.push(8);
        stack.push(3);
        stack.push(5);

        System.out.println("Popped value is " + stack.pop());
        System.out.println("current daata is " + stack.peek());

    }
}

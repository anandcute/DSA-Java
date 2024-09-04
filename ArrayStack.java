public class ArrayStack<T> {
   static final int max_size = 20 ;
   T array[] = (T[])new Object[max_size];
   int top;

   ArrayStack(){
    top = -1 ;
   }
   public void push(T value){
    if(top < max_size - 1){
        array[++top] = value ;
    }
   }
   public T pop(){
        if(top == -1){
            throw new IndexOutOfBoundsException("stack is empty");
        }
        return array[top--] ;
   }
   T peek(){
     return array[top];
   }
   boolean isEmpty(){
    return top == -1 ;
   }

   public static void main(String[] args) {
    ArrayStack<Integer> stack = new ArrayStack<Integer>();
    stack.push(8);
    stack.push(3);
    stack.push(1);
    System.out.println("Popped element is " + stack.pop());
    System.out.println("Current value " + stack.peek());
   }
}

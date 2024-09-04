public class Array_Queue<T> {            //but space waste agum.it is also not efficient 
    int max_size = 10;          
    T array[] = (T[])new Object[max_size];
    int front , rear;
    Array_Queue(){
        front = -1;
        rear = -1 ;
    }
    public void enqueue(T value){      // o(1)
        if(rear == max_size - 1){     
            throw new IndexOutOfBoundsException("Queue is full");
        }
        if(front== -1)
            front++;
        array[++rear] = value;
    }
    public T dequeue(){      //o(1)
        if(front == -1 || front > rear){
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        
        return array[front++];
    }
    public static void main(String[] args) {
        Array_Queue<Integer> queue = new Array_Queue<Integer>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Dequeue the value : " + queue.dequeue());
        System.out.println("Dequeue the value : " + queue.dequeue());
        System.out.println("Dequeue the value : " + queue.dequeue());
        System.out.println("Dequeue the value : " + queue.dequeue());

    }
}

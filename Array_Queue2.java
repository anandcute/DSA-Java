public class Array_Queue2 {            // Dequeue using shift concept but its is not efficient because code run more time 
    int max_size = 10;
    int array[] = new int[max_size];
    int rear;
    Array_Queue2(){
        rear = -1 ;
    }
    public void enqueue(int value){   // o(1)
        if(rear == max_size - 1){
            throw new IndexOutOfBoundsException("Queue is full");
        }
        array[++rear] = value;
    }
    int dequeue(){   // 0(n)
        if(rear == -1){
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        int temp = array[0];
        for(int i = 1 ; i < array.length ; i++){
            array[i-1] = array[i];
        }
        rear--;
        return temp;
    }
    public static void main(String[] args) {
        Array_Queue2 queue = new Array_Queue2();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Dequeue the value : " + queue.dequeue());
        System.out.println("Dequeue the value : " + queue.dequeue());
        System.out.println("Dequeue the value : " + queue.dequeue());
        System.out.println("Dequeue the value : " + queue.dequeue());

    }
}


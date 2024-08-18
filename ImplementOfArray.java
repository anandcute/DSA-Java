import java.util.Scanner;

class DynamicArray<T> {

    static final int initialCapacity = 4 ; 
    private int size;
    private int[] array;
    private int capacity;
    public DynamicArray() {
        size = 0;
        capacity = initialCapacity;
        array = new int[capacity];
    }
    public void insertAtEnd(T val){
        if(size == capacity){
            expandedArray();
        }
        array[size++] = val;

    }
    private  void expandedArray(){
        capacity *= 2 ; 
        array =java.util.Arrays.copyOf(array, capacity); 
    }
    public void display (){
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public void insertAtPos(int pos , T val){
        if(capacity == size)
            expandedArray();
        for(int i = size-1 ; i >= pos ; i--)
            array[i+1] = array[i];
        array[pos] = val;
        size++;
    
    }
    public void deleteAtPos(int pos){
        for(int i = pos+1 ; i < size; i++ )
            array[i-1] = array[i];
        size--;  
        
        if(capacity > initialCapacity && capacity > 3 * size)
            shrinkArray();

    }
    private void shrinkArray(){
        capacity /= 2;
        array = java.util.Arrays.copyOf(array, capacity);
    }
    public void updatedValue(int pos , T val){
        array[pos] = val;
    }
    public boolean searchElement(T val){
       int flag = 0;
       for(int i = 0 ; i < size; i++ ){
            if(array[i] == val){
                flag = 1;
                break;
            }      
        }
        if(flag == 0){
            return false;
        }
        return true;
    }
            
    public int getValue(int pos){
        return array[pos];
    }
    public void insertAtBeginning(T val){
        if(size == capacity){
            expandedArray();
        }
        for(int i = size-1 ; i > 0; i--){
            array[i+1] = array[i];
        }
        array[0] = val;
        size++;
    }       
    
}
public class ImplementOfArray {
    public static void main(String[] args) {
        DynamicArray<Integer> list = new DynamicArray<Integer>();
        Scanner sc = new Scanner(System.in);
        int val ;
        int pos;

        while (true) {
            System.out.println("\n______________________________________");
            System.out.println("\n______________MENU___________________");
            System.out.println("\n______________________________________");
            System.out.println("\n1.Insert the element ");
            System.out.println("\n2.Display the Array ");
            System.out.println("\n3.Insert at specified position ");
            System.out.println("\n4.Delete from specified position");
            System.out.println("\n5.Delete at last element ");
            System.out.println("\n6.Delete the begining element ");
            System.out.println("\n7.Update the element ");
            System.out.println("\n8.Search the element ");
            System.out.println("\n9.Insert at begining");
            System.out.println("\n10.Get the Element ");
            System.out.println("\n11.Exit");
            System.out.println("\n_________x__________________x___________");
            System.out.print("Enter your choice 1 to 5 : " );

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                   System.out.println("Enter the value to be inserted");
                   val = sc.nextInt();
                   list.insertAtEnd(val);
                   break;
                case 2:
                    list.display();
                    break;
                case 3:
                    System.out.println("Enter the insert the pos (start at's form '0') : ");
                    pos = sc.nextInt();
                    System.out.println("Enter the value to be inserted");
                    val = sc.nextInt();
                    list.insertAtPos(pos, val);
                case 4:
                    System.out.println("Delete the specified position");
                    pos = sc.nextInt();
                    list.deleteAtPos(pos);
                case 5:
                    System.out.println("enetr the value 0 t0  size -1");
                    pos = sc.nextInt();
                    list.deleteAtPos(pos);
                    System.out.println("Deleted last value suceessfully! ");
                    break;
                case 6:
                    System.out.println("enetr the value 0 ");
                    pos = sc.nextInt();
                    list.deleteAtPos(pos);
                    System.out.println("Deleted Begining value suceessfully! ");
                    break;
                case 7:
                    System.out.println("eneter the no to 0 to size");
                    pos = sc.nextInt();
                    System.out.println("Enter the value to be updated");
                    val = sc.nextInt();
                    list.updatedValue(pos,val);
                    break;
                case 8:
                    System.out.println("enter the value given search ");
                    val = sc.nextInt();
                    System.out.println(list.searchElement(val));
                    break;
                case 9:
                    System.out.println("enter the value given search ");
                    pos = sc.nextInt();1
                    System.out.println("Insert the value beginning");
                    val = sc.nextInt();
                    list.insertAtPos(pos, val);
                    break;
                case 10:
                    System.out.println("Enter the value of get ");
                    pos= sc.nextInt();
                    System.out.println(list.getValue(pos)); 
                    break;  
                case 11:
                    System.out.println("---------Thank you-----------!");
                    System.exit(11);
                    break;
                default:
                    System.out.println("Invalid choice");
            }   

        }

        
    }
    
}

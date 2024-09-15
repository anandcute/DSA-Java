import java.util.Arrays;

public class ImplementationBubble {
    public static void main(String[] args) {
        // int array[] = {22,10,14,13,6,17};
        int array[] = {5, 4,3, 2};
        BubbleSort.bubbleSortMin(array);
        System.out.println(Arrays.toString(array)); 
        BubbleSort.bubbleSortMax(array);
        System.out.println(Arrays.toString(array)); 

    }
}

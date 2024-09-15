import java.util.Arrays;

public class ImplementionInsertion{
    public static void main(String[] args) {
        int[] arr = {5 ,8 ,2 ,4 ,3 ,9};
        InsertionSort.insertionSortMin(arr);
        System.out.println(Arrays.toString(arr));

        InsertionSort.insertionSortMax(arr);
        System.out.println(Arrays.toString(arr));
    }
}
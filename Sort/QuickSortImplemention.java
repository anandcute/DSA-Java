import java.util.Arrays;

public class QuickSortImplemention {
    public static void main(String[] args) {
        int arr[] = {5,8,4,3,7,6,2,9};
        QuickSort.quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

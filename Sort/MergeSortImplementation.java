import java.util.Arrays;

public class MergeSortImplementation {
    public static void main(String[] args) {
        int[] input = {5, 9, 6, 4, 1, 3, 8, 2};
        input = MergeSort.mergeSort(input);
        System.out.println(Arrays.toString(input));

        int arr[] = {9,4,7,1,6,2,8,3};
        MergeSort.mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    
}

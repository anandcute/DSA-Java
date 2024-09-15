import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        
        return merge(left , right);
    }

    public static int[] merge(int[] first , int[] second){
        int[] joinArr = new int[first.length + second.length];
        int i = 0 , j = 0 , k = 0 ;
        while (i < first.length && j < second.length) {
            if(first[i] < second[j])
                joinArr[k++] = first[i++];
            else
                joinArr[k++] = second[j++];    
        }
        while (i< first.length) {
            joinArr[k++] = first[i++];
        }
            
        while (j < second.length) {
            joinArr[k++] = second[j++];    
        }

        return joinArr;
    }

    public static void mergeSortInPlace(int[] arr , int start , int end){
        if(end - start == 1 )
            return;
        int mid = (start + end) / 2 ;
        
        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);

        mergeInPlace(arr, start , mid , end);
    }
    public static void mergeInPlace(int[] arr , int start , int mid , int end){
        int[] join = new int[end - start];

        int i = start , j = mid , k = 0 ;
        while (i < mid && j < end) {
            if(arr[i] > arr[j])
                join[k++] = arr[i++];
            else
                join[k++] = arr[j++];     
        }
        while (i < mid) {
            join[k++] = arr[i++];
        }
        while (j < end) {
            join[k++] = arr[j++];
        }
        for(k = 0 ; k < join.length ; k++){
            arr[start + k] = join[k];
        }
    }
}

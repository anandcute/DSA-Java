public class QuickSort {
    public static void quickSort(int[] arr , int low , int high){
        if(low >= high)
            return;

        int start = low;
        int end = high;
        int mid = (start + end) / 2 ;
        
        while (start <= end) {
            int pivot = arr[mid];
            while(arr[start] < pivot)
                start++;
            while(arr[end] > pivot)
                end--;    
        
            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        quickSort(arr, low, end);
        quickSort(arr, start, high);
    }
}

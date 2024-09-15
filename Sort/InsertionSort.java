public class InsertionSort {
    public static void insertionSortMin(int arr[]){
        for(int i = 1 ; i < arr.length ; i++){
            for(int j = i ; j > 0 ; j--){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else
                    break;
            }
        }
    }
    public static void insertionSortMax(int arr[]){
        for(int i = 1 ; i < arr.length; i++){
            for(int j = i ; j > 0 ; j--){
                if(arr[j-1] < arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else
                    break;
            }
        }
    }
}

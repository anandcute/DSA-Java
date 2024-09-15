public class BubbleSort {
    public static void bubbleSortMin(int array[]){   //Time complexity - > o(n^2)
        int n = array.length;
        for (int i = 1 ; i < n ; i++){
            for(int j = 0 ; j < n - i  ; j++ ){ 
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    } 
    public static void bubbleSortMax(int array[]){
        for (int i = 1 ; i < array.length ; i++){
            boolean swapped = false;
            for(int j = 0 ; j < array.length - i  ; j++ ){ 
                if (array[j] < array[j+1]) {
                    swapped = true;
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            if(!swapped)
                break;
        }
    } 
}

public class SelectionSort{
    public static void SelectionSort(int array[]){
        for(int i = 0; i < array.length ; i++){
            int minIndex = i;
            for(int j = i ; j < array.length ; j++){
                if(array[i] > array[j]){
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp ;

        }
    }
    public static void SelectionMax(int array[]){
        for (int i = 0 ; i < array.length ; i++){
            int maxIndex = i;
            for(int j = i ; j < array.length ; j++){
                if(array[i] < array[j]){
                    maxIndex = j ;
                }
            }
            int temp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = temp;
        }
    }
}
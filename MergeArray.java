// Merge array no using inbuild function

import java.util.Arrays;

public class MergeArray {

    public int[] mergeArray (int arr[] , int arr1[]){
        int mergeArr[] = new int[arr.length + arr1.length];
        for(int i = 0 ; i < arr.length ; i++){
            mergeArr[i] = arr[i];
        }
        for(int j = 0 ; j < arr1.length; j++){
            mergeArr[arr.length + j ] = arr1[j];
        }

        // for(int array : mergeArr){
        //     System.out.print(array + " ");
        // }
        return mergeArr;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int arr1[] = {4,5,6};

        MergeArray a = new MergeArray();
        System.out.println(Arrays.toString(a.mergeArray(arr, arr1)));

        // int mergeArr[] = new int[arr.length + arr1.length];

        // int i = 0 ;

        // for (int element : arr) {
        //     mergeArr[i] = element;
        //     i++;
        // }
        // for (int element : arr1) {
        //     mergeArr[i] = element;
        //     i++;
        // }

        // for (int element : mergeArr) {
        //     System.out.print(element + " ");
        // }
    }
}

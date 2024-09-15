public class ImplementionOfBinarySearch {

    public static void main(String[] args){
        int[] arr = {1, 3, 5, 6, 10, 12, 15, 20, 21, 28};

        int[] arr1 = {27, 21, 17, 15, 12, 10, 6, 4, 2, 1};
        
        System.out.println(BinarySearch.search(arr, 1));

        System.out.println(BinarySearch.search(arr1, 0));

    }
}
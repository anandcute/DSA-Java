public class BinarySearch {
    /*
     * work only sorted array
     * return the index target
     * else return -1
     * Time complexity - o(log n)
     */
    public static int search(int[] array , int target){
        int start = 0;
        int end = array.length - 1 ;

        boolean acendOrder = false;
        if(array[start] < array[end] )
            acendOrder = true;
        while (start <= end) {
            int mid = (start+end)/2;
            if(acendOrder){//Ascending order
                if(target > array[mid]) //focus on right           
                    start = mid + 1 ;
                else if(target < array[mid])  // focus on left
                    end = mid - 1 ;
                else
                    return mid;    
            }
            //Descending order
            //[27,21,17,15,12,10,6,4,2,1]
            else{
                if(target < array[mid])
                    start = mid + 1 ;
                else if(target > array[mid])
                    end = mid - 1;
                else
                    return mid;    
            }
            
        }
        return -1 ;
    }
}

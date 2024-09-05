public class LinearSearch {
    
    public static int find(int[] array , int target){
        for(int i = 0; i < array.length; i++){
           if(array[i] == target){
            return i;
           }
        }     
        return -1;        
    }
    public static boolean contains(int[] array , int target){
        for(int i = 0 ; i < array.length ; i++)
            if(array[i] == target)
                return true;
        
        return false;        
    }

    public static int find(String str , char ch){
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == ch)
                return i;
        }
        return -1;
    }

    public static boolean contains(String str , char ch){
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == ch)
                return true;
        }
        return false;
    }

    //Two dimentional array
    public static int[] find(int[][] array , int target){
        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array[i].length ; j++)
                if(array[i][j] == target)
                    return new int[]{i , j};
        }
        return new int[] {-1,-1};
    }

    public static int maxArr(int[] array){
        int max = array[0];
        for(int i = 1 ; i < array.length ; i++){
            if(array[i] > max)
                max = array[i];

        }
        return max;
    }
    public static int minArray(int[] array){
        int min = array[0];
        for(int i = 1 ; i < array.length ; i++){
            if(array[i] < min)
                min = array[i];
        }
        return min ;
    } 

    public static int repeatChValue(String str , char ch){
        int count = 0 ;
        for(int i = 0 ; i < str.length(); i++ ){
            if(str.charAt(i) == ch)
                count++;
        }
        return count ;
    }
    public static int countOfDigits(int[] arr){
        int count = 0 ;
       for (int num : arr) {
            if(num >= 1000 && num <= 9999)
                count++;
            else if (num <= -1000 && num >= -9999) {
                count++;
            }   
       }
        return count ;
    }
        
        
}

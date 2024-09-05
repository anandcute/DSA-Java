import java.util.Arrays;

public class ImplementionOfLinearSearch {

    public static void main(String[] args) {
        int array[] = {2,8,5,1,10,6};
        System.out.println(LinearSearch.find(array,5));

        System.out.println(LinearSearch.contains(array,4));

        String str = "Anand";
        System.err.println(LinearSearch.find(str, 'n'));

        System.out.println(LinearSearch.contains(str, 'd'));

        int[][] twoDemArr = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15}
        };
        int result[] = LinearSearch.find(twoDemArr, 12);
        System.out.println(Arrays.toString(result)); 

        System.out.println("Maximum value is " + LinearSearch.maxArr(array));

        System.out.println("Minimum value is " + LinearSearch.minArray(array));

        System.out.println(LinearSearch.repeatChValue(str, 'n'));

        int arr[] = {123,-3003,2222,9843,1000,234};

        System.out.println(LinearSearch.countOfDigits(arr));

    }
    
}

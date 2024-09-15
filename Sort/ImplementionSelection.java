import java.util.Arrays;

public class ImplementionSelection {
    public static void main(String[] args) {
        int[] array = {10, 5, 26, 3, 15,22};
        SelectionSort.SelectionSort(array);
        System.out.println(Arrays.toString(array));
        SelectionSort.SelectionMax(array);
        System.out.println(Arrays.toString(array));

    }    
}

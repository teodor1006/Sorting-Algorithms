import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // min is the index of the smallest element with an index greater or equal to i
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // Swapping i-th and min-th elements
            int swap = arr[i];
            arr[i] = arr[min];
            arr[min] = swap;
        }
    }
    public static void main(String[] args){
        int[] array = {16, 5, 30, 6, 7, 2};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}

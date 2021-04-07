import java.util.Arrays;

public class InsertionSortAlgo {
     public static void insertionSortAlgo(int arr[]){
         for(int i = 1; i < arr.length;i++){
             int key = arr[i];
             int j = i;
             while (j > 0 && arr[j-1] > key){
                 arr[j]=arr[j-1];
                 j--;
             }
             arr[j] = key;
         }
     }
public static void main(String[] args){
    int[] array = new int[]{1, 7, 5, 6, 9, 4, 2, 3};
    insertionSortAlgo(array);
    System.out.println(Arrays.toString(array));
}
}

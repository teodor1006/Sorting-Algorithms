import java.util.Arrays;

public class BubbleSortJava {

    public static void main(String[] args){

     int[] array = {30,13,23,10,3};
     print(Arrays.toString(array));

     for(int i = 0, size = array.length; i < size - 1; i++){
         for(int j = 0; j < size - 1 - i; j++){
             if(array[j]>array[j+1]){
                 int temp = array[j];
                 array[j] = array[j+1];
                 array[j+1] = temp;
             }
         }
     }
     print(Arrays.toString(array));

}
     private static void print (String s) {
         System.out.println(s);
    }

     }
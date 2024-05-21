package sortingalgorithm;
import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr ={6,2,7,1,8};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    private static int[] insertionSort(int[] arr) {
        int n =arr.length;
        for (int j = 1; j < n; j++) {
            int check = arr[j];
            int i = j-1;
            while ( (i > -1) && ( arr [i] > check ) ) {
                arr [i+1] = arr [i];
                i--;
            }
            arr[i+1] = check;
        }
        return arr;
        }
}

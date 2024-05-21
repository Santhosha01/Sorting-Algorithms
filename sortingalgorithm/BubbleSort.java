package sortingalgorithm;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,2,6,8,3};
        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr) {
        boolean swap;
        do {
            swap=false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap = true;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }while(swap);
        System.out.println(Arrays.toString(arr));
    }

}

package sortingalgorithm;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={2,9,3,5,1};
        selectionSort(arr);
    }

    private static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
           int min=arr[i];
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<min){
                    int temp=min;//2
                    min=arr[j];
                    arr[i]=min;
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}


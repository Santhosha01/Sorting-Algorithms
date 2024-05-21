package sortingalgorithm;
import java.util.Arrays;
public class ShellSort {
    public static void main(String[] args) {
        int arr[]={8,2,5,7,9,1};
        shellSort(arr,arr.length); 
        System.out.println(Arrays.toString(arr));
    }  
 
    private static void shellSort(int[] a, int n) {
        for (int interval = n/2; interval > 0; interval /= 2)  
    {  
        for (int i = interval; i < n; i += 1)  
        { 
            int temp = a[i];  
            int j;        
            for (j = i; j >= interval && a[j - interval] >   
temp; j -= interval)  {
                a[j] = a[j - interval];  
               }
            a[j] = temp;  
        }  
    }  
    } 
}

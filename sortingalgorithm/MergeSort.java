package sortingalgorithm;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={8,2,5,7,9,1};
        divideArray(arr); 
        System.out.println(Arrays.toString(arr));
    }

    private static void divideArray(int[] arr) {
       int n=arr.length;
       if(n<=1){
        return ;
       }
       int middle=n/2;

       int leftarray[]=new int[middle];
       int rightarray[]=new int[n-middle];
       int i=0,j=0;
       for(;i<n;i++){
        if(i<middle){
            leftarray[i]=arr[i];
        }
        else{
            rightarray[j]=arr[i];
            j++;
        }
       }
       divideArray(leftarray);
       divideArray(rightarray);
       mergeSort(leftarray,rightarray,arr);
    }

    private static void mergeSort(int[] leftarray, int[] rightarray, int[] arr) {
       int leftlength=arr.length/2;
       int rightlength=arr.length-leftlength;
       int i=0,l=0,r=0;
       while(l<leftlength&&r<rightlength){
          if(leftarray[l]<rightarray[r]){
            arr[i]=leftarray[l];
           i++;
           l++;  
        }
          else{
             arr[i]=rightarray[r];
             i++;
             r++;
          }
       }
       while(l<leftlength){
        arr[i]=leftarray[l];
        i++;
        l++;
       }
       while(r<rightlength){
        arr[i]=rightarray[r];
        i++;
        r++;
       }
    }
}

package src.StriverSheet;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysDay4 {

    public static void main(String[] args) {

        int[] arr = new int[]{1,3,2,3,1};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));

    }

    public static int majorityElement(int[] arr){

        int count = 0;
        int maj = 0;

        for (int j : arr) {
            if (count == 0) {
                maj = j;
                count = 1;
            } else if (maj == j) {
                count++;
            } else {
                count--;
            }
        }

        return maj;
        // no need to verify if we find the majority element or not. // as question said there is always a majority element.

    }

    public List<Integer> majority2(int[] arr){
        
        // define element..

        int c1 = 0;
        int c2 = 0;
        int maj1 = 0;
        int maj2 = 0;


        for (int i = 0; i < arr.length; i++) {

            if (c1==0){

            }
            // rest code..


        }

        List<Integer> ans = new ArrayList<>();

        return ans;
    }

    // find reverse pair...

    // megr sort..


    public static int[] mergeSort(int[] arr){

        int i =0;
        int j = arr.length-1;

        return merge_sort(arr, i, j);

    }

    public static int[] merge_sort(int[] arr, int i, int j){

        if (i<j){

            int mid = (j+i)/2;
            merge_sort(arr, i, mid);
            merge_sort(arr, mid+1, j);
            merge(arr, i, mid, j);

        }
        return arr;

    }

    public static int[] merge(int[] arr, int l, int mid, int r){


        int n1 = mid-l+1;
        int n2 = r-mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid+1+j];
        }

        //

        int i = 0, j = 0;
        int k = l;

        while (i<n1 && j <n2){

            if (L[i]<=R[j]){
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k]=R[j];
                j++;
            }
            k++;
        }

        // copy rest elenment of L and R

        while (i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }

        while (j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }

        return arr;

    }

    public static int reversePair(int[] arr){

        int c = 0;

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {

                if ((long) arr[i]> (long) 2*arr[j]){
                  c++;
                }

            }
        }
        return c;

    }
}

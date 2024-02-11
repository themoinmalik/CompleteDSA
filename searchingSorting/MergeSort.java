package src.searchingSorting;

import java.util.Arrays;

public class MergeSort {


    public static void main(String[] args) {
        int arr[] = new int[]{8,6,2,5,4,2,7,1};

        int[] ans = mergeSort(arr, arr.length);
        System.out.println(Arrays.toString(ans));

    }


    public static int[] mergeSort(int[] arr, int n){

//        int n = arr.length;


        if (n<2) return arr;

        int mid = n/2;

        int l1[] = new int[mid];
        int l2[] = new int[n-mid];


        for (int i = 0; i < mid; i++) {
            l1[i] = arr[i];
        }

        for (int i = mid; i < n; i++) {
            l2[i-mid] = arr[i];
        }

        int[] sn = mergeSort(arr, mid);
        System.out.println(Arrays.toString(sn));
        mergeSort(arr, n-mid);
        merge(arr, l1, l2, mid, n-mid);

        return arr;
    }


    public  static int[] merge(int[] arr, int[] l1, int[] l2, int left, int right){

        int i = 0, j = 0, k = 0;

        while (left>i && right> j){
            if (l1[i]>l2[j])
            arr[k++] = l1[i++];
            else {
                arr[k++] = l2[j++];
            }
        }

        while (i<left){
            arr[k++] = l1[i++];
        }

        while (j<right){
            arr[k++] = l2[j++];
        }

        return arr;

    }
}

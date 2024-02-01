package src.StriverSheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static src.arrays1D.TwoSum.reverse;
import static src.arrays1D.TwoSum.swap;

public class ArrayDay1 {


    public static void main(String[] args) {

        List<List<Integer>> trians = triangle(0);
        System.out.println(trians);

        int[] arr = new int[]{2,0,2,1,1,0};

//        int maxsum= maxSum(arr);
//        System.out.println(maxsum);
//
//        int[] ans = nextPermutation(arr);
//        System.out.println(Arrays.toString(ans));


        int[] sort = sortColor(arr);
        System.out.println(Arrays.toString(sort));


    }


    // set matrix zero..




    // pascal Triangle..
    public static List<List<Integer>> triangle(int num){

        // edge cases...

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        ans.add(firstRow);



        for (int i = 1; i < num; i++) {
            List<Integer> prevRow = ans.get(i-1);
            List<Integer> row = new ArrayList<>();

            // create row ...
            row.add(1);
            for (int j = 1; j <i; j++) {
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }
            row.add(1);
            ans.add(row);
        }

        return ans;

    }

    // max Summ ... kadan's aklgoruithm ..

    public static int maxSum(int[] arr){

        int sum =0;
        int max_sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];
            max_sum = Math.max(sum, max_sum);

            if (sum<0){
                sum = 0;
            }

        }
        return max_sum;
    }


    // next permutation...
    public static int[] nextPermutation(int[] arr){

        int gola = -1;
        int n = arr.length;

        for (int i = n-1; i >0 ; i--) {

            if (arr[i] > arr[i-1]){
                gola = i-1;
                break;
            }

        }

        int swap = gola;

        for (int j = n-1; j >0 ; j--) {

            if (arr[j] > arr[gola]){
                swap = j;
                break;
            }

        }
        swap(arr, gola, swap);
        reverse(arr, gola+1, n-1);
        return arr;

    }


    // sort colors ...
    public static int[] sortColor(int[] arr){

        int m = 0;
        int l = 0;
        int r = arr.length-1;

        while (m<=r){

            if (arr[m] == 0){
                swap(arr, m, l);
                m++;
                l++;
            } else if (arr[m] == 1) {
                m++;
            } else if (arr[m] == 2) {
                swap(arr, m, r);
                m++;
                r--;
            }
        }
        return arr;
    }
}

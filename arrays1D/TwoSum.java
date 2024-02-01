package src.arrays1D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class TwoSum {

    public static void main(String[] args) {

//        int[] arr = new int[]{1,2};
//        7,1,5,3,6,4
        // 7,6,4,3,1
//        int target = 13;

//        int[] ans = twoSum(arr, target);
//        System.out.println(Arrays.toString(ans));
//
//        // next permutation...
//        int[] ans1 = nextPermutation(arr);
//        System.out.println(Arrays.toString(ans1));
//
//        int[] arrcolor = new int[]{1,2,0};
//        int[] answ = sortcolor(arrcolor);
//        System.out.println(Arrays.toString(answ));


//        System.out.println(maxProfit(arr));

        int[] arr = new int[]{1,3,4,2,2};
//        int ans = findDuplicate(arr);
//        System.out.println(ans);

    }

    public static int findMissing(int[] nums) {

        int i =0;

        while (i<nums.length)
        {
            int c_in = nums[i]-1;

            if (nums[i]!=nums[c_in]){
                swap(nums, i, c_in);
            }else {
                i++;
            }

        }

        // find dupliocate.. .

        for (int j = 0; j < nums.length; j++) {

            if (nums[j]!=j+1){
                return j+1;
            }

        }

        return -1;
    }


    // buy sell ... stock ..

    public static int maxProfit(int[] arr){

        int max_profit = Integer.MIN_VALUE;
        int pur = arr[0];
        int sell;


        for (int i = 0; i<=arr.length-1;i++){

            pur = Math.min(arr[i], pur);
            sell = Math.max(arr[i], pur);

            max_profit = Math.max(sell-pur, max_profit);

        }





        return Math.max(max_profit, 0);

    }


    public static int[] sortcolor(int[] arr){

       int l = 0;
       int h = arr.length-1;
       int mid = 0;

       while (mid<=h){

           if (arr[mid] == 0){
               swap(arr, mid, l);
               mid++;
               l++;
           }else if (arr[mid] == 1){
               mid++;
           } else if (arr[mid] == 2) {
               swap(arr, mid, h);
               h--;

           }

       }

       return arr;

    }

//    private static int[] twoSum(int[] arr, int target) {
//        for (int i=0;i<arr.length;i++) {
//            for (int j=i+1; j<arr.length;j++) {
//                int sum = arr[i] + arr[j];
//                if (sum == target) {
//                    return new int[]{i,j};
//                }
//            }
//        }
//
//        return null;
//    }

    public static int[] nextPermutation(int[] arr) {

        int gola_index = -1;

        for(int i = arr.length-1;i>=0;i--){
            if(arr[i]>arr[i-1]){
               gola_index = i-1;
               break;
            }
        }

        int swap_index = gola_index;
        //
        for(int j = arr.length-1; j>=0;j--){

            if (arr[j]>arr[gola_index]){
                swap_index = j;
                break;
            }
        }
        swap(arr, gola_index,swap_index);
        reverse(arr, swap_index+1, arr.length-1);

        return arr;

    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void reverse(int[] arr, int start, int end){

        while (start<end){
            swap(arr, start,end);
            start++;
            end--;
        }

    }


    private static int[] twoSum(int[] arr, int target) {

        // creating Hashmap
        HashMap<Integer,Integer> map = new HashMap<>();

        // filling HP
        for (int i =0; i<arr.length; i++) {
            map.put(arr[i],i);  // arrays values...
        }

        // checking values.
        for (int i=0; i<arr.length;i++) {
            int rem = target - arr[i];

            if (map.containsKey(rem)) {
                int index = map.get(rem);
                return new int[]{i,index};
            }
        }

        return null;

    }



    // two sum....
}

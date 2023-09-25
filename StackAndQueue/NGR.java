package StackAndQueue;

import java.util.Arrays;

public class NGR {

    public static void main(String[] args) {

        int[] arr = new int[]{1,3,2,4};
        int[] ans = right(arr);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] right(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {

                if (arr[j]>arr[i]){
                    arr[i] = arr[j];
                    break;
                }

            }
        }
        arr[arr.length-1] = -1;

        return arr;
    }
}

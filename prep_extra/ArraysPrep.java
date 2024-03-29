package src.prep_extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysPrep {

    public static void main(String[] args) {

//        int[] arr = new int[]{2,2,4,5,};
//        int e = 0;
//        boolean ans = searchEle(arr, e);
//        System.out.println(ans);
//
//        int[] ans1 = reverseArr(arr);
//        System.out.println(Arrays.toString(ans1));

        List<Integer> list = Arrays.asList(24,1,4,3,1,3,14);
        List<Integer> ans = List.of(13,2,4,1,0,3,45);

        List<List<Integer>> anr = List.of(list,ans);

        System.out.println(anr.get(0));

        int a = 10;
        int b = 10;

        System.out.println(a==b);   // true

        Integer c = 500;
        Integer d = 500;

        System.out.println(c==d);  // true

        Integer e = 50;
        Integer f = 50;

        System.out.println(e==f);  // true

    }

    // searching ..

    public static boolean searchEle(int[] arr, int e ){

        for (int i = 0; i < arr.length; i++) {
            if (e == arr[i]){
                return true;
            }
        }
        return false;

    }

    // reverse a string..

    public static int[] reverseArr(int[] arr){

        int[] newArr = new int[arr.length];
        int j = 0;

        for (int i = arr.length-1; i >=0 ; i--) {
            newArr[j] = arr[i];
            j++;
        }
        return newArr;
    }
}

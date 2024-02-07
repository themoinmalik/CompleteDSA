package src.StriverSheet;

import java.util.ArrayList;
import java.util.List;

public class TwoPointers {


    public static void main(String[] args) {

        int arr[] = new int[]{2,7,11,15};
        int t = 9;
        List<Integer> ans = twoSum(arr, t);
        System.out.println((ans));

    }

    public static List<Integer> twoSum(int arr[], int t){

        int l = 0;
        int r = arr.length-1;
        List<Integer> list = new ArrayList<>();

        while (l<=r){

            int sum = arr[l]+arr[r];
            if (sum==t){
                list.add(l,r);
            } else if (sum<t) {
                l++;
            }else {
                r--;
            }

        }

        return list;

    }
}

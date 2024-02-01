package src.StriverSheet;


import java.util.ArrayList;
import java.util.List;

public class ArraysDay4 {


    public static void main(String[] args) {

        int[] arr = new int[]{6,5,5};
        int ans = majorityElement(arr);
        System.out.println(ans);

    }

    public static int majorityElement(int[] arr){

        int count = 0;
        int maj = 0;

        for (int i = 0; i < arr.length; i++) {
            if (count == 0){
                maj = arr[i];
                count = 1;
            }
            else if (maj == arr[i] ){
                count++;
            }else {
                count--;
            }
        }

        return maj;


        // no need to verify if we find the majority element or not. // as question said there is always a majority element.

    }

    public List<Integer> majority2(int[] arr){
        
        
        int c1 = 0;
        int e1 = 0;
        int c2 = 0;
        int e2 = 0;

        for (int i = 0; i < arr.length; i++) {

            if (c1 == 0){
                e1 = arr[i];
                c1 = 1;
            } else if (e1==arr[i]) {
                c1++;
            } else if (c2 == 0) {
                e2 = arr[i];
                c2 =1;
            } else if (e2==arr[i]) {
                c2++;
            } else {
                c1--;
                c2--;
            }

        }


        List<Integer> ans = new ArrayList<>();

        c1 = 0; c2 = 0;

        for (int i : arr) {
            if (i==e1)
                c1++;
            else if (i==e2)
                c2++;
        }

        if (c1>arr.length/3)
            ans.add(e1);
        if (c2>arr.length/3)
            ans.add(e2);

        return ans;
    }
}

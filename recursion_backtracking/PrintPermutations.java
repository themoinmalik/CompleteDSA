package src.recursion_backtracking;

import java.util.ArrayList;
import java.util.List;

public class PrintPermutations {


    public static void main(String[] args) {

        int[] arr = {1,2,3};
        boolean[] selected = new boolean[arr.length];
        List<Integer> ans = new ArrayList<>();
        permutations(arr,0,selected ,ans);

    }

    public static void permutations(int[] arr, int ind, boolean[] sel, List<Integer> ans){

        // base condition
        if (ind==arr.length){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (sel[i]==false){
                sel[i] = true;
                ans.add(arr[i]);
                permutations(arr,ind+1,sel,ans);
                sel[i]=false;
                ans.remove(ans.size()-1);
            }

        }

    }
}

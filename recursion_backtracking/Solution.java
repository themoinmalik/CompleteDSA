package src.recursion_backtracking;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        int start = 0;
        backtrack(result,new ArrayList<>(), nums, start);

        return result;
    }

    public static void backtrack(List<List<Integer>> result, List<Integer> list, int [] arr, int start ){

        result.add(new ArrayList<>(list));

        for (int i = start; i < arr.length; i++) {

            list.add(arr[i]);
            backtrack(result,list,arr, i+1);
            list.remove(list.size()-1);

        }

    }
}
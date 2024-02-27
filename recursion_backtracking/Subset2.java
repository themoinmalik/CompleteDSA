package src.recursion_backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset2 {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2};
        List<List<Integer>> ans = subsets(arr);
        System.out.println(ans);
    }

    public static List<List<Integer>> subsets(int[] nums){

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtracksolution(result, new ArrayList<>(), nums, 0);
        return result;
    }

    public static void backtracksolution(List<List<Integer>> result, List<Integer> list, int[] nums, int start){

        if (result.contains((list)))
            return;

        result.add(new ArrayList<>(list));

        for (int i = 0; i < nums.length; i++) {

            list.add(nums[i]);
            backtracksolution(result, list, nums, i++);
            list.remove(list.size()-1);

        }

    }
}

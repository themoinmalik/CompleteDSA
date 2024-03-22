package src.recursion_backtracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {

    public List<List<Integer>> permutation(int[] arr){

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(arr, result, list, 0, 0);
        return result;

    }

    public void solve(int[] arr, List<List<Integer>> result, List<Integer> list, int start, int index){

        if (start> arr.length)
            return;

        if (start==arr.length)
            result.add(new ArrayList<>(list));

        for (int i = start; i < arr.length; i++) {

            list.add(arr[i]);
//            solve(arr, result, list, i);

        }


    }
}


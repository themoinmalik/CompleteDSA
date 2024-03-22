package src.recursion_backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Permutation {

    public List<List<Integer>> permutation(int[] arr){

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(arr, result, list);
        return result;

    }


    public void solve(int[] arr, List<List<Integer>> result, List<Integer> list){

        if (list.size() == arr.length){
            result.add(new ArrayList<>(list));
        }

        for (int i = 0; i < arr.length; i++) {
            if (list.contains(arr[i])){
                continue;
            }
            list.add(arr[i]);
            solve(arr, result, list);
            list.remove(list.size()-1);
        }

    }
}

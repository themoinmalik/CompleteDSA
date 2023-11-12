package src.recursion_backtracking;

import java.util.ArrayList;
import java.util.List;

public class FindSubsets {


    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3);
        List<List<Integer>> ans = subsets(list);
        System.out.println(ans);

    }

    public static void calSubsets(List<Integer> arr, List<List<Integer>> res, List<Integer> subset, int ind){

        res.add(new ArrayList<>(subset));

        for (int i = ind; i < arr.size(); i++) {
            subset.add(arr.get(i));
            calSubsets(arr,res,subset,i+1);
            subset.remove(subset.size()-1);
        }
    }

    public static List<List<Integer>> subsets(List<Integer> arr){

        List<Integer> subset = new ArrayList<>();
        List<List<Integer>> res =  new ArrayList<>();

        int index = 0;

        calSubsets(arr, res,subset,index);

        return res;

    }

}

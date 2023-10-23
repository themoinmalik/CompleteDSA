package src.recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SubsetsOfArray {

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3};
        List<List<Integer>> ans = subsets(arr);
        System.out.println(ans);

    }

    public static void generateSubsets(int[] arr, int i, List<Integer> res, List<List<Integer>> powerSet ){

       if (i == arr.length){
           powerSet.add(new ArrayList<>(res));
           return;
       }
       res.add(arr[i]);
       generateSubsets(arr,i+1,res,powerSet);

       res.remove(res.size()-1);
       generateSubsets(arr,i+1,res,powerSet);

    }


    public static List<List<Integer>> subsets(int[] arr){

        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsets(arr, 0, curr, subsets);

        return  subsets;

    }
}

package src.recursion_backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

    public static void main(String[] args) {

        int[] can = new int[]{10,1,2,7,6,1,5};
        int t = 8;
        List<List<Integer>> ans = combinationSum2(can,t);
        System.out.println(ans);
    }


    public static void solve(int[] candidates, int target,List<List<Integer>> sol,List<Integer> temp,int index,int sum)
    {
        if(sum>target)
            return;
        if(target==sum  )
            sol.add(new ArrayList<>(temp));
        for(int i=index;i<candidates.length;i++)
        {
            if(i > index && candidates[i] == candidates[i-1]) continue;
            temp.add(candidates[i]);
            solve(candidates,target,sol,temp,i+1,sum+candidates[i]);
            temp.remove(temp.size()-1);
        }

    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> sol=new ArrayList<>();
        int sum=0;
        Arrays.sort(candidates);
        solve(candidates,target,sol,new ArrayList<>(),0,sum);
        return sol;

    }
}


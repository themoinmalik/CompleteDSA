package src.recursion_backtracking;

import java.util.ArrayList;
import java.util.List;

class Combination {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        combinationSum(candidates, target, result, new ArrayList<>(), 0, 0);
        return result;

    }

    private void combinationSum(int[] candidates, int target, List<List<Integer>> result, List<Integer> path, int sum, int start) {

        // base case
        if (sum > target) { // failure base case
            return;
        }

        if (sum == target) { // success base case
            result.add(new ArrayList<>(path));
        }

        // recursive case
        for (int i = start; i < candidates.length; i++) {

            if (i>start && candidates[i] == candidates[i-1]){ // skipped, if same number found consecutively
                continue;
            }

            sum += candidates[i];
            path.add(candidates[i]);
            combinationSum(candidates, target, result, path, sum, i+1);
            // backtracking
            sum -= candidates[i];
            path.remove(path.size() - 1);
        }

    }
}
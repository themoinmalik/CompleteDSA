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
            return;
        }

        // recursive case
        for (int i = start; i < candidates.length; i++) {

            sum += candidates[i];
            path.add(candidates[i]);

            combinationSum(candidates, target, result, path, sum, i);

            // backtracking
            sum -= candidates[i];
            path.remove(path.size() - 1);
        }

    }
}
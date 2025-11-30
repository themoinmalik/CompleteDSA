package src.recursion_backtracking;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] sortArray(int[] nums) {
        List<Integer> numList = new ArrayList<>();
        for (int num : nums) {
            numList.add(num);
        }

        sorted(numList);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = numList.get(i);
        }

        return nums;
    }

    public void sorted(List<Integer> nums) {
        if (nums.size() <= 1) {
            return;
        }

        int temp = nums.remove(nums.size() - 1);
        sorted(nums);
        insert(nums, temp);
    }

    public void insert(List<Integer> nums, int temp) {
        if (nums.isEmpty() || nums.get(nums.size() - 1) <= temp) {
            nums.add(temp);
            return;
        }

        int last = nums.remove(nums.size() - 1);
        insert(nums, temp);
        nums.add(last);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {12, 11, 13, 5, 6};
        System.out.println("Original array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        int[] sortedArray = solution.sortArray(nums);

        System.out.println("\nSorted array:");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}

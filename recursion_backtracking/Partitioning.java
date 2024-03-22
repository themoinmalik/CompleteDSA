package src.recursion_backtracking;

import java.util.ArrayList;
import java.util.List;

public class Partitioning {

    public static void main(String[] args) {

        int[] arr = new int[]{2,4,1,34};

    }


    public List<List<String>> partition(String s){

        List<List<String>> result = new ArrayList<>();
        List<String> path  = new ArrayList<>();
        solve(s, result, path, 0);
        return result;

    }

    public void solve(String s, List<List<String>> result, List<String> path, int start){

        if (start == s.length()){
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < s.length(); i++) {

            if (isPalindrom(s, start, i)){
                path.add(s.substring(start, i+1));
                solve(s, result, path, i+1);

                // backtrack...
                path.remove(path.size()-1);
            }

        }


    }

    public boolean isPalindrom(String s, int start, int end){

        while (start<=end){
            if (s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}

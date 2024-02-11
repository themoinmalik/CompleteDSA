package src.SlidingWindows;

import java.util.Arrays;
import java.util.HashSet;

public class LargestConsecutiveSequence {


    public static void main(String[] args) {




    }

    public static int sequenceCount(int[] arr){

       Arrays.sort(arr);
       HashSet<Integer> set = new HashSet<>();

       int max = 0;

       set.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {

            if (arr[i-1]==arr[i]-1){
                set.add(arr[i]);
                continue;
            }
            if (arr[i] == arr[i-1]){
                continue; // handle duplicates
            }

            if (set.size()>max){
                max = set.size();
            }
            set.clear();
            set.add(arr[i]);
        }

        return Math.max(max, set.size());

    }

}

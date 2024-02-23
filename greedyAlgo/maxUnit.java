package src.greedyAlgo;

import java.util.Arrays;
import java.util.Map;

public class maxUnit {


    public static void main(String[] args) {

    }

    public static int maxUnit(int[][] arr, int t){

        int ans = 0;
        int n = arr.length;

        Arrays.sort(arr, (x,y) -> y[1]-x[1]);

        for (int[] e : arr) {

            int q = e[0];
            q = Math.min(q, t);
            ans = ans + e[1] * q;
            t = t - q;

            if (t == 0) {
                break;
            }

        }

        return ans;
    }
}
